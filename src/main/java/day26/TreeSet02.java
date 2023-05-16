package day26;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet02 {
    /*
        Question-1: What do we do to store unique elements in natural order?
                    We use TreeSet.

        Question-2: As we know TreeSet is so slow in adding and removing elements, what do we do to make it fast?
                    i) Create a HashSet.
                    ii) Add the elements into HashSet.
                    iii) Convert HashSet to TreeSet.
    */
    public static void main(String[] args) {
        HashSet<String> hSet = new HashSet<>();
        TreeSet<String> tSet1 = new TreeSet<>();

        //1st Way:
        long time1 = System.nanoTime();
        hSet.add("A");
        hSet.add("C");
        hSet.add("B");
        hSet.add("T");
        hSet.add("M");
        TreeSet<String> tSet2 = new TreeSet<>(hSet);
        long time2 = System.nanoTime();

        //2nd Way:
        tSet1.add("A");
        tSet1.add("C");
        tSet1.add("B");
        tSet1.add("T");
        tSet1.add("M");
        long time3 = System.nanoTime();

        System.out.println("HashSet + TreeSet: " + (time2 - time1));
        System.out.println("TreeSet: " + (time3 - time2));
    }
}

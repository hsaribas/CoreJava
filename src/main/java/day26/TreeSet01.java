package day26;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet01 {
    /*
        iii) TreeSet:
             a) TreeSet is for storing "unique elements" in "natural order".
             b) TreeSet is very slow because of that we do not want to do adding and removing operations with TreeSet.
    */
    public static void main(String[] args) {
        TreeSet<String> tSet = new TreeSet<>();
        tSet.add("Apple");
        tSet.add("Mango");
        tSet.add("Orange");
        tSet.add("Palm");
        tSet.add("Apricot");
        tSet.add("Palm");//Second "Palm" could not be added
        //tSet.add(null); ==> TreeSet does not accept "null" as element
        System.out.println(tSet);//[Apple, Apricot, Mango, Orange, Palm]

        TreeSet<String> sub1 = (TreeSet<String>) tSet.subSet("Apricot", "Palm");//First is inclusive, second is exclusive
        System.out.println(sub1);//[Apricot, Mango, Orange]

        TreeSet<String> sub2 = (TreeSet<String>) tSet.subSet("Apricot", false, "Palm", true);
        System.out.println(sub2);//[Mango, Orange, Palm]

        //ceiling() returns the element after the given element if the element does not exist.
        String el1 = tSet.ceiling("Nancy");
        System.out.println(el1);//Orange

        String el2 = tSet.ceiling("Man");
        System.out.println(el2);//Mango

        //ceiling() returns the given element if the given element exists.
        String el3 = tSet.ceiling("Mango");
        System.out.println(el3);//Mango

        //floor() returns the element before the given element if the element does not exist.
        String el4 = tSet.floor("Nancy");
        System.out.println(el4);//Mango

        //floor() returns the given element if the given element exists.
        String el5 = tSet.floor("Mango");
        System.out.println(el5);//Mango

        //[Apple, Apricot, Mango, Orange, Palm]
        //headSet() returns the elements from the beginning to the given element(exclusive).
        SortedSet<String> sub3 = tSet.headSet("Orange");
        System.out.println(sub3);//[Apple, Apricot, Mango]

        SortedSet<String> sub4 = tSet.headSet("Orange", true);
        System.out.println(sub4);//[Apple, Apricot, Mango, Orange]

        //[Apple, Apricot, Mango, Orange, Palm]
        //tailSet() returns the elements from the end to the given element(inclusive).
        SortedSet<String> sub5 = tSet.tailSet("Mango");
        System.out.println(sub5);//[Mango, Orange, Palm]

        SortedSet<String> sub6 = tSet.tailSet("Mango", false);
        System.out.println(sub6);//[Orange, Palm]
    }
}

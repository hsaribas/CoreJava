package day26;

import java.util.HashSet;

public class HashSet01 {
    /*
        1) When you see the word "Set" in Java, it means no repeated elements, all elements are unique.
        2) "Set" is an interface, it has 3 concrete child classes;
           i) HashSet    ii) LinkedHashSet    iii) TreeSet

        i) HashSet:
           a) It is the fastest set.
           b) It does not put elements in any order, elements will be in random order.
           c) All elements are unique in HashSet.
           d) HashSet allows using just a single "null" element.
    */
    public static void main(String[] args) {
        HashSet<String> hSet = new HashSet<>();
        hSet.add("A");
        hSet.add("Z");
        hSet.add("M");
        hSet.add("B");
        hSet.add("Y");
        System.out.println("First H: " + hSet.add("H"));//"true" means "first H" added
        System.out.println("Second H: " + hSet.add("H"));//"false" means "second H" could not be added
        hSet.add(null);
        hSet.add(null);
        System.out.println(hSet);
    }
}

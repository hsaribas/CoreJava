package day26;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
    /*
        ii) LinkedHashSet:
            a) LinkedHashSet puts the elements in insertion order.
    */
    public static void main(String[] args) {
        LinkedHashSet<String> lhSet = new LinkedHashSet<>();
        System.out.println(lhSet.add(null));//true
        System.out.println(lhSet.add(null));//false
        lhSet.add("A");
        lhSet.add("BFED");
        lhSet.add("ZK");
        lhSet.add("M");
        lhSet.add("KLM12");
        lhSet.add("?");
        System.out.println(lhSet);//[null, A, BFED, ZK, M, KLM12, ?]
    }
}

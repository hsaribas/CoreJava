package day27;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashMap01 {

    public static void main(String[] args) {
        //Type code to find the number of occurrences of letters in a String.
        //"toms are phantoms." ==> t=2 o=2 m=2 s=2 a=2 r=1 e=1 p=1 h=1 n=1
        String s = "13, toms are phantoms.";

        //Remove punctuation marks and spaces and digits and symbols.
        s = s.replaceAll("[^a-zA-Z]", "");
        System.out.println(s);//tomsarephantoms

        //Get the characters one by one.
        String[] letters = s.split("");
        System.out.println(Arrays.toString(letters));//[t, o, m, s, a, r, e, p, h, a, n, t, o, m, s]

        //Count the occurrences.
        Map<String, Integer> result = new HashMap<>();
        for (String w : letters) {
            Integer numOfOccurrence = result.get(w);
            if (numOfOccurrence == null) {
                result.put(w, 1);
            } else {
                result.put(w, numOfOccurrence + 1);
            }
        }
        System.out.println(result);
    }
}

package day14;

import java.util.Arrays;
import java.util.Comparator;

public class Day14ForEachLoop04 {

    public static void main(String[] args) {
        //Find the longest word in a String.
        String sentence = "JavaJava is easy if you study. Actually nothing is easy if you do not study.";

        //Remove the punctuation marks.
        //Put every word in an array ==> [Java, is, easy, if, you, study, Actually, nothing, is, easy, if, you, do, not, study]
        //Sort the array elements according to the lengths==> [is, is, if, if,  do, you, you, not, Java, easy, easy, study, study, nothing, Actually]
        //Last element will be the longest one.

        String sentenceWithoutPunctuation = sentence.replaceAll("\\p{Punct}", "");
        System.out.println(sentenceWithoutPunctuation);//Java is easy if you study Actually nothing is easy if you do not study

        String[] words = sentenceWithoutPunctuation.split(" ");
        System.out.println(Arrays.toString(words));//[Java, is, easy, if, you, study, Actually, nothing, is, easy, if, you, do, not, study]

        Arrays.sort(words, Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(words));//[JavaJava, Actually, nothing, study, study, easy, easy, you, you, not, is, if, is, if, do]
        System.out.println(words[0]);//JavaJava

        //How to see all the longest elements if there are many
        //[JavaJava, Actually, nothing, study, study, easy, easy, you, you, not, is, if, is, if, do]
        for (String w : words) {
            if (w.length() == words[0].length()) {
                System.out.print(w + " ");
            }
        }
    }
}

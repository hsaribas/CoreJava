package day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Day17ArrayLists03 {
    /*
        Count the words in a String one by one.
        String is "Ali came to school and Ayse came to school".
        Ali=1, came=2, to=2, school=2, and=1, Ayse=1
    */
    public static void main(String[] args) {
        String str = "Ali came to came school, and Ayse came to school.";
        String strWithoutPunctuation = str.replaceAll("\\p{Punct}", "");
        System.out.println(strWithoutPunctuation);//Ali came to school and Ayse came to school
        String[] words = strWithoutPunctuation.split(" ");
        System.out.println(Arrays.toString(words));//[Ali, came, to, school, and, Ayse, came, to, school]

        List<String> wordsList = new ArrayList<>();
        Collections.addAll(wordsList, words);

        String word = "";
        int counter = 1;
        //[Ali, came, to, came, school, and, Ayse, came, to, school]
        for (int i = 0; i < wordsList.size(); i++) {
            word = wordsList.get(i);
            for (int k = i + 1; k < wordsList.size(); k++) {
                if (word.equals(wordsList.get(k))) {
                    counter++;
                    wordsList.remove(k);
                    k--;
                }
            }
            System.out.println(word + " = " + counter);
            counter = 1;
        }
    }
}

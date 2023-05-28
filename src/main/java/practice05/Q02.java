package practice05;

import java.util.Arrays;
import java.util.Scanner;

public class Q02 {
    /*
         Create a method to ask user to enter two strings and check them if they are "Anagram" or not.

          ===Interview Question===
         * Anagram is to create a new word from other word's characters.
		 * Write a Java code to check if two words are anagram or not.
		 * isAnagram("listen", "silent") ==> anagram
		 * Dormitory = Dirty room
		 * School master = The classroom
		 * Conversation = Voices rant on
		 * Listen = Silent
		 * Astronomer = Moon starer
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String first = input.nextLine();
        System.out.println("Enter second string: ");
        String second = input.nextLine();

        anagram(first, second);
    }

    public static void anagram(String str1, String str2) {
        String[] arr = str1.toLowerCase().replace(" ", "").split("");
        String[] brr = str2.toLowerCase().replace(" ", "").split("");
        Arrays.sort(arr);
        Arrays.sort(brr);

        if (Arrays.equals(arr, brr)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}

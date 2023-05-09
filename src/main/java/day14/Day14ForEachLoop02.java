package day14;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Day14ForEachLoop02 {

    public static void main(String[] args) {
        //Sort the array elements according to their lengths.
        //["Michael", "Ali", "Maria", "Veli"] ==> "Ali", "Veli", "Maria", "Michael"
        String[] arr = {"Michael", "Ali", "Maria", "Veli"};
        System.out.println(Arrays.toString(arr));//["Michael", "Ali", "Maria", "Veli"]
        Arrays.sort(arr, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(arr));//["Ali", "Veli", "Maria", "Michael"]

        //Sort the array elements according to their lengths in descending order.
        //["Michael", "Ali", "Maria", "Veli"] ==> "Michael", "Maria", "Veli", "Ali"
        String[] brr = {"Jackson", "Tom", "Dustin", "Mary"};
        System.out.println(Arrays.toString(brr));//["Jackson", "Tom", "Dustin", "Mary"]
        Arrays.sort(brr, Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(brr));//["Jackson", "Dustin", "Mary", "Tom]

        //Sort the array elements in descending order according to their lengths.
        //If some elements are in the same length put them in alphabetical order.
        //["Jack", "Mark", "Adam", "Jackson", "Marry", "Junior Thomson"]
        String[] crr = {"Jack", "Mark", "Adam", "Jackson", "Marry", "Junior Thomson"};
        Arrays.sort(crr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(crr));

        //Note: "natural order" means "alphabetical order" for Strings and "ascending order" in numbers.

        Integer[] drr = {1, 28, 25, 99, 54};
        Arrays.sort(drr, Collections.reverseOrder());
        System.out.println(Arrays.toString(drr));//[99, 54, 28, 25, 1]
    }
}

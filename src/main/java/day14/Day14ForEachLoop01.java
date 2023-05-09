package day14;

import java.util.Arrays;

public class Day14ForEachLoop01 {

    public static void main(String[] args) {
        //Type codes to check if 2 given arrays have exactly same elements.
        //arr[] = {12, 3, -5, 14}   brr[] = {14, -5, 12, 3}
        //Note: Arrays class has a method to check if 2 given arrays are same(Elements and orders are same) or not.
        //[12, 4 , -1] != [12, -1, 4]    [12, 4, -1] == [12, 4, -1]

        int[] arr = {12, 3, -5, 14};
        int[] brr = {14, -5, 12, 3};
        Arrays.sort(arr);//[-5, 3, 12, 14]
        Arrays.sort(brr);//[-5, 3, 12, 14]
        boolean areTheySame = Arrays.equals(arr, brr);
        System.out.println("Are the arrays same? " + areTheySame);

        //Type code to check if a specific element exists in an array or not.
        String[] crr = {"Java", "Selenium", "Api", "Sql"};
        String expectedElement = "Sql";

        int counter = 0;//Flag is used to check if a specific scenario occurred in an array or not
        for (String w : crr) {
            if (w.equals(expectedElement)) {
                counter++;
                break;
            }
        }
        if (counter > 0) {
            System.out.println("The array has the expected element");
        } else {
            System.out.println("The array doesn't have the expected element");
        }

        //Type code to check if the number of usage of specific element in an array.
        //[12, 2, 23, -5, 12, 23, 12] ==> 12 was used 3 times
        //                            ==> -5 was used 1 time
        //                            ==> 200 was used 0 time
        int[] drr = {12, 2, 23, -5, 12, 23, 12};
        int expected = 12;
        int flag = 0;
        for (int w : drr) {
            if (w == expected) {
                flag++;
            }
        }
        System.out.println(expected + " was used " + flag + " time/s");
    }
}

package day14;

import java.util.Arrays;
import java.util.Scanner;

public class Day14ForEachLoop03 {

    public static void main(String[] args) {
        //Check if the array elements in the natural order. "A", "B", "C" ==> true - "A", "C", "B" ==> false
        String[] arr = {"A", "C", "B"};
        System.out.println(Arrays.toString(arr));//[A, C, B]

        //How to create a copy of the given array
        //1.Way: By using loops
        // String[] copyOfArr = new String[arr.length];//[null, null, null]
        // int idx = 0;
        // for(String w : arr){
        //     copyOfArr[idx] = w;
        //     idx++;
        // }
        // System.out.println(Arrays.toString(copyOfArr));//[A, C, B]

        //2.Way: By using existing method
        String[] copyOfArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copyOfArr);
        System.out.println(Arrays.toString(copyOfArr));//[A, B, C]

        if (Arrays.equals(arr, copyOfArr)) {
            System.out.println("Array elements in alphabetical order");
        } else {
            System.out.println("Array elements are not in alphabetical order");
        }

        //binarySearch() method in Arrays Class: It is used to check existence of an element in an array.
        int[] brr = {12, 13, 5, 11, -2};

        //It is mandatory to be able to get meaningful response from binarySearch().
        Arrays.sort(brr);
        int response1 = Arrays.binarySearch(brr, 13);//binarySearch() returns the index, if the element exists
        //So zero or positive integers mean the element exists in the array.
        System.out.println(response1);

        int response2 = Arrays.binarySearch(brr, 14);
        System.out.println(response2);//We will get -6 for 14.
        //                              i)"-" means 14 does not exist
        //                              ii)"6" means if 14 would exist it would be the 6th element

        //Check if a specific element exists in an Array.
        //If the element exists return the index of the element.
        //If the element does not exist return a message.
        int[] crr = {13, 41, 2, 543};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the element to check if it exists or not: ");
        int i = scan.nextInt();
        Arrays.sort(crr);
        int response3 = Arrays.binarySearch(crr, i);

        if (response3 < 0) {
            System.out.println(i + " doesn't exist");
        } else {
            System.out.println("Index of the element " + i + " is " + response3);
        }
    }
}

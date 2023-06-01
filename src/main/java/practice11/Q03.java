package practice11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q03 {
    //Create a method to take a six element array from user and put the odd numbers into a list and print it.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element of index " + i + ": ");
            arr[i] = input.nextInt();
        }
        System.out.println("Array: " + Arrays.toString(arr));

        takeOddNumbers(arr);
    }

    public static void takeOddNumbers(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int w : arr) {
            if (w % 2 != 0) {
                list.add(w);
            }
        }
        System.out.println("Odd Numbers: " + list);
    }
}

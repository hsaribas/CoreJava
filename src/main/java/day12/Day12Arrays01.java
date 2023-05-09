package day12;

import java.util.Arrays;

public class Day12Arrays01 {

    public static void main(String[] args) {
        //1) Arrays are used for storing multiple data.
        //2) An array can have just a single data type.
        //3) Arrays can store just primitive data types or references of non-primitives.
        //4) When you create an array you have to declared its length(number of elements in array).

        //How to create an Array
        int[] ages = new int[5];

        //How to print Array on the console
        System.out.println(Arrays.toString(ages));//[0, 0, 0, 0, 0]

        //How to assign values to Array elements.
        ages[0] = 12;
        ages[1] = 20;
        ages[2] = 11;
        ages[3] = 9;
        ages[4] = 15;
        System.out.println(Arrays.toString(ages));//[12, 20, 11, 9, 15]

        //How to print array elements one by one
        System.out.println(ages[4]);//15

        //Print the sum of the ages array on the console.
        //1st way:
        System.out.println(ages[0] + ages[1] + ages[2] + ages[3] + ages[4]);//67

        //2nd way:
        int sum = 0;
        for (int i = 0; i < ages.length; i++) {
            sum = sum + ages[i];
        }
        System.out.println(sum);

        //How to create an array and assign values in short way
        String[] names = {"Tom", "Jim", "Alex", "Karl"};
        System.out.println(Arrays.toString(names));

        //Find the total number of characters in array elements.
        int total = 0;
        for (int i = 0; i < names.length; i++) {
            total = total + names[i].length();
        }
        System.out.println(total);//14
    }
}

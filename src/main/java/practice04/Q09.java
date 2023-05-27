package practice04;

import java.util.Arrays;

public class Q09 {
    /*
        Type a code to calculate the sum of the numbers for each inner arrays in a multidimensional array
        and print them on console as single-dimensional array.
        input = {{10, 20, 30}, {4}, {6, 7, 20}} ==> output = {60, 4, 33}
    */
    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30}, {4}, {6, 7, 20}};
        int[] brr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                brr[i] = brr[i] + arr[i][j];
            }
        }
        System.out.println(Arrays.toString(brr));
    }
}

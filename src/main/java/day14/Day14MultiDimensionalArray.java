package day14;

import java.util.Arrays;

public class Day14MultiDimensionalArray {

    public static void main(String[] args) {
        int[][] arr = new int[4][3];
        arr[2][1] = 5;

        //deepToString(arr) is to print multidimensional arrays.
        System.out.println(Arrays.deepToString(arr));
    }
}

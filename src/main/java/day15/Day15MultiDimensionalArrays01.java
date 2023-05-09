package day15;

import java.util.Arrays;

public class Day15MultiDimensionalArrays01 {

    public static void main(String[] args) {
        int[][] mda = new int[3][2];//[[0, 0],[0, 0],[0, 0]]
        System.out.println(Arrays.deepToString(mda));

        mda[1][1] = 11;
        mda[2][0] = -7;
        mda[0][0] = 12;
        mda[2][1] = 16;
        mda[0][1] = -3;
        mda[1][0] = 5;
        System.out.println(Arrays.deepToString(mda));//[[12, -3], [5, 11], [-7, 16]]

        //Example 1: Find the sum of the first and the last inner array elements.
        int sum = 0;
        for (int i = 0; i < mda.length; i++) {
            if (i == 0 || i == mda.length - 1) {
                for (int w : mda[i]) {
                    sum += w;
                }
            }
        }
        System.out.println(sum);//18

        //Example 2: Type code to find the total number of elements in the multidimensional array.
        int[][] arr = {{5, 2}, {11, 13, 15}, {6}, {-2, 3, 5, 12}};
        int totalNumOfEl = 0;
        for (int[] w : arr) {
            totalNumOfEl = totalNumOfEl + w.length;
        }
        System.out.println(totalNumOfEl);//10

        //Example 3: Print the elements which has "a" in it from a multidimensional array.
        String[][] brr = {{"Java", "is"}, {"easy", "to", "learn"}, {"if", "you", "study", "hard"}};
        for (String[] w : brr) {
            for (String u : w) {
                if (u.contains("a")) {
                    System.out.print(u + " ");
                }
            }
        }

        System.out.println();

        //Example 4: Convert two-dimensional array to one-dimensional array.
        String[][] crr = {{"Java", "is"}, {"easy", "to", "learn"}, {"if", "you", "study", "hard"}};
        int numOfEl = 0;
        for (String[] w : crr) {
            numOfEl = numOfEl + w.length;
        }
        System.out.println(Arrays.deepToString(crr));

        String[] drr = new String[numOfEl];
        int idx = 0;
        for (String[] w : crr) {
            for (String u : w) {
                drr[idx] = u;
                idx++;
            }
        }
        System.out.println(Arrays.toString(drr));

        //Example 5: Find the sum of the max and min element in an integer multidimensional array.
        int[][] err = {{5, 2}, {11, 130, 15}, {6}, {-2, 3, 5, 12}};
        //Find the maximum element
        System.out.println(Arrays.deepToString(err));
        //1st Way:
        int max = err[0][1];
        for (int[] w : err) {
            for (int u : w) {
                if (u > max) {
                    max = u;
                }
            }
        }
        System.out.println("max: " + max);

        //2nd Way:
        int max2 = Integer.MIN_VALUE;
        for (int[] w : err) {
            for (int u : w) {
                max2 = Math.max(max2, u);
            }
        }
        System.out.println("max2: " + max2);

        //Find the minimum
        int min = Integer.MAX_VALUE;
        for (int[] w : err) {
            for (int u : w) {
                min = Math.min(min, u);
            }
        }
        System.out.println("min: " + min);

        System.out.println("Sum of the max and min: " + (max + min));//128
    }
}

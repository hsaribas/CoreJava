package day13;

public class Day13Arrays04 {

    public static void main(String[] args) {
        //Create an integer array and print all the elements less than 5.
        int[] arr = {12, 3, -3, 5, 23, 100, 67, 1, -7};

        //1st Way: Use regular loops(for-while-do while)
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < 5) {
                System.out.print(arr[i] + " ");
            }
            i++;
        }

        System.out.println("\n===========================");

        //2nd Way: Use for-each loop(Enhanced Loop)(for-each loop can be used just with arrays and collections)
        for (int w : arr) {
            if (w < 5) {
                System.out.print(w + " ");
            }
        }
    }
}

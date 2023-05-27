package practice04;

import java.util.Scanner;

public class Q04 {
    /*
        Type a code to ask user to enter the number of row and print the shape below according to that number.
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
        16 17 18 19 20 21
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of row: ");
        int row = input.nextInt();
        int a = 1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }
}

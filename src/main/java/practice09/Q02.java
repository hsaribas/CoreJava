package practice09;

import java.util.Scanner;

public class Q02 {
    /*
        Take the number of rows from user and print on console the shape based on rows.
                  *
                 * *
                * * *
               * * * *
              * * * * *
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int row = input.nextInt();

        for (int i = 0; i < row; i++) {
            for (int space = row - i; space > 1; space--) {
                System.out.print(" ");
            }
            for (int star = 0; star <= i; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

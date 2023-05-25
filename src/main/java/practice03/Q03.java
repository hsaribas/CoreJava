package practice03;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
        /*
            Type a code to ask user to enter an integer to check if it is a 'Perfect Number' or not.
            A perfect number is a positive integer that is equal to the sum of all its proper divisors.
            6 = 1 + 2 + 3, 28 = 1 + 2 + 4 + 7 + 14, (496 and 8128)
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer to check if it is a Perfect Number or not: ");
        int num = scan.nextInt();
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == num) {
            System.out.println(num + " is a Perfect Number");
        } else {
            System.out.println(num + " is not a Perfect Number");
        }
    }
}

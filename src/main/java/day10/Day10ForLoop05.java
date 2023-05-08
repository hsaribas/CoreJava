package day10;

import java.util.Scanner;

public class Day10ForLoop05 {
    /*
        Ask the user how many fibonacci numbers he wants to see.
        Then write the code that prints these fibonacci numbers.
        Example: If user enters 6 output it will be 1 1 2 3 5 8
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of fibonacci number to see: ");
        int n = input.nextInt();

        int fibo1 = 1;
        int fibo2 = 1;
        int fibonacci = 0;
        System.out.print(fibo1 + " ");
        System.out.print(fibo2 + " ");

        for (int i = 1; i < n - 1; i++) {
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
            System.out.print(fibonacci + " ");
        }
    }
}

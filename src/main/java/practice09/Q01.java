package practice09;

import java.util.Scanner;

public class Q01 {
    //Ask user to enter 2 chars and print on console the chars between them.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first char: ");
        char ch1 = input.next().charAt(0);
        System.out.println("Enter second char: ");
        char ch2 = input.next().charAt(0);

        int first = Math.min(ch1, ch2);
        int second = Math.max(ch1, ch2);
        System.out.println("The chars between " + (char) first + " and " + (char) second + " :");

        for (int i = first + 1; i < second; i++) {
            System.out.print((char) i + " ");
        }
    }
}

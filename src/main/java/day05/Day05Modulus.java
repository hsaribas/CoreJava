package day05;

import java.util.Scanner;

public class Day05Modulus {
    /*
        Modulus Operator: % is called Modulus Operator in Java.
                          It returns the remainder in a division operation.
                          13 % 5 ==> 3
    */
    public static void main(String[] args) {
        System.out.println(13 % 5);
        //Ask user to enter an integer to print the last digit of the integer on the console.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = input.nextInt();

        int absN = Math.abs(num);
        System.out.println(absN);

        int lastDigit = absN % 10;
        System.out.println(lastDigit);

        //Ask user to enter his/her birth year, then print just last 2 digits.
        int lastTwoDigits = absN % 100;
        System.out.println(lastTwoDigits);

        //Ask user to enter an integer then check if the number is even.
        System.out.println("Is the number even? " + (absN % 2 == 0));

        //Ask user to enter an integer then check if the number is odd.
        System.out.println("Is the number odd? " + (absN % 2 != 0));

        //Ask user to enter a 3 digits integer to find sum of the digits.
        int last = absN % 10;
        absN = absN / 10;
        int second = absN % 10;
        absN = absN / 10;
        int first = absN % 10;
        System.out.println(first + second + last);
    }
}

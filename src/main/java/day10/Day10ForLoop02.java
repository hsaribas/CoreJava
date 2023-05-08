package day10;

import java.util.Scanner;

public class Day10ForLoop02 {

    public static void main(String[] args) {
        //Interview Question
        //Type code to reverse a String
        //Tom Hanks ==> sknaH moT
        String s = "Tommy";
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed = reversed + s.charAt(i);
        }
        System.out.println(reversed);

        //Type code to find the sum of the digits of an integer
        //2543 ==> 14
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer to find the sum of the digits: ");
        int num = input.nextInt();
        int absNum = Math.abs(num);
        int sumOfDigits = 0;
        for (int i = absNum; i > 0; i = i / 10) {
            sumOfDigits = sumOfDigits + i % 10;
        }
        System.out.println(sumOfDigits);
    }
}

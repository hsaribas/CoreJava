package practice10;

import java.util.Scanner;

public class Q05 {
    /*
        Create a method that accepts a String as a parameter and finds the sum of digits in that String.
        Ex:
        Input : J4\/4 1$ 34$¥
        Output : 16
        Hint:
        Character.isDigit()
        Integer.parseInt()
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();

        sumOfDigits(str);
    }

    public static void sumOfDigits(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        System.out.println("Sum of digits: " + sum);
    }
}

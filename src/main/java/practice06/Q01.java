package practice06;

import java.util.Scanner;

public class Q01 {
    /*
        Ask user to enter an integer and print 'Even' for even integers.
        Increase the value by 3 for odd integers and print it on console by using ternary.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = input.nextInt();

        String str = num % 2 == 0 ? "Even" : String.valueOf(num + 3);
        System.out.println(str);
    }
}

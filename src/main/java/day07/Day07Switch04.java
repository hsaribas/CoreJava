package day07;

import java.util.Scanner;

public class Day07Switch04 {
    //Ask user to enter one of the +, -, *, /, % operation.
    //Ask user to enter two values then return the result of the operation.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        double num1 = input.nextDouble();
        System.out.println("Enter 2nd number: ");
        double num2 = input.nextDouble();
        System.out.println("Enter one of the operation signs -> +, -, *, /, %: ");
        char opr = input.next().charAt(0);

        switch (opr) {
            case '+':
                System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
                break;
            case '/':
                System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
                break;
            case '%':
                System.out.println(num1 + "%" + num2 + "=" + (num1 * num2 / 100));
                break;
            default:
                System.out.println("Enter a valid operator");
        }
        //Note 1: String, int, char can be used in switch parenthesis.
        //Note 2: boolean, long, float, double can not be used in switch parenthesis.
    }
}

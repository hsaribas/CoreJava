package day07;

import java.util.Scanner;

public class Day07Switch01 {
    //Ask user to enter the month name then print the month number.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter month name: ");
        String month = input.next();

        if (month.equalsIgnoreCase("January")) {
            System.out.println(1);
        } else if (month.equalsIgnoreCase("February")) {
            System.out.println(2);
        } else if (month.equalsIgnoreCase("March")) {
            System.out.println(3);
        } else if (month.equalsIgnoreCase("April")) {
            System.out.println(4);
        } else if (month.equalsIgnoreCase("May")) {
            System.out.println(5);
        } else if (month.equalsIgnoreCase("Jun")) {
            System.out.println(6);
        } else if (month.equalsIgnoreCase("July")) {
            System.out.println(7);
        } else if (month.equalsIgnoreCase("August")) {
            System.out.println(8);
        } else if (month.equalsIgnoreCase("September")) {
            System.out.println(9);
        } else if (month.equalsIgnoreCase("October")) {
            System.out.println(10);
        } else if (month.equalsIgnoreCase("November")) {
            System.out.println(11);
        } else if (month.equalsIgnoreCase("December")) {
            System.out.println(12);
        } else {
            System.out.println("Enter a valid month name");
        }

        System.out.println("=============================");
        //Note: If you have more than 3 conditions use switch statement.

        switch (month.toLowerCase()) {
            case "january":
                System.out.println(1);
                break;
            case "february":
                System.out.println(2);
                break;
            case "march":
                System.out.println(3);
                break;
            case "april":
                System.out.println(4);
                break;
            case "may":
                System.out.println(5);
                break;
            case "jun":
                System.out.println(6);
                break;
            case "july":
                System.out.println(7);
                break;
            case "august":
                System.out.println(8);
                break;
            case "september":
                System.out.println(9);
                break;
            case "october":
                System.out.println(10);
                break;
            case "november":
                System.out.println(11);
                break;
            case "december":
                System.out.println(12);
                break;
            default:
                System.out.println("Enter a valid month name");
        }
    }
}

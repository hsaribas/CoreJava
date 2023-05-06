package day06;

import java.util.Scanner;

public class Day06NestedIfStatement01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your gender...");
        String gender = input.next().toLowerCase();
        System.out.println("Enter your age...");
        int age = input.nextInt();

        /*
            If the gender is "Male" and the age is less than 13 print "Boy" otherwise print "Man" on the console.
            If the gender is "Female" and the age is less than 13 print "Girl" otherwise print "Woman" on the console.
            If the gender is different from "Male" and "Female" print "No information" on the console.
        */

        if (gender.equals("male")) {
            if (age < 13) {
                System.out.println("Boy");
            } else {
                System.out.println("Man");
            }
        } else if (gender.equals("female")) {
            if (age < 13) {
                System.out.println("Girl");
            } else {
                System.out.println("Woman");
            }
        } else {
            System.out.println("No information");
        }
    }
}

package day09;

import java.util.Scanner;

public class Day09StringManipulations02 {
    /*
        Check if a password has the following conditions;
            i) It should not be empty
            ii) It should not be just a single space
            iii) It should not have spaces at the beginning and at the end
            iv) 'i' should be a character in the password and first occurrence of 'i' should be at index 4
            v) 'K' should be a character in the password and last occurrence of 'K' should be at index 5
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String pwd = input.nextLine();

        if (pwd.isEmpty()) {
            System.out.println("Password can not be empty");
        } else {
            System.out.println("Password is not empty");
        }
        if (pwd.isBlank()) {
            System.out.println("Password can not be blank");
        } else {
            System.out.println("Password is not blank");
        }
        if (pwd.length() != pwd.trim().length()) {
            System.out.println("Password can not have spaces at the beginning and at the end");
        } else {
            System.out.println("Password doesn't have spaces at the beginning and at the end");
        }
        if (pwd.indexOf("i") == 4) {
            System.out.println("First occurrence of 'i' is at index 4");
        } else {
            System.out.println("Password should have 'i' at index 4");
        }
        if (pwd.lastIndexOf('K') == 5) {
            System.out.println("Last occurrence of 'K' is at index 5");
        } else {
            System.out.println("Last occurrence of 'K' should be at index 5");
        }
    }
}

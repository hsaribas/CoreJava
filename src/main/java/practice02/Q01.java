package practice02;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
        //1 1 2 3 5 8 Fibonacci
        int n1 = 1;
        int n2 = 1;
        int n3;
        System.out.print(n1 + " " + n2 + " ");

        for (int i = 1; i < 9; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3 + " ");
        }

        System.out.println();

        /*
            Ask user to enter first name, middle name and last name as one single String then print the first
            character of middle name and last name.
            Ex: Mark Hansel Twain ==> HT
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name, middle name and last name: ");
        String str = input.nextLine().trim().toUpperCase();

        char initialOfMiddleName = str.charAt(str.indexOf(" ") + 1);
        char initialOfLastName = str.charAt(str.lastIndexOf(" ") + 1);
        System.out.print("" + initialOfMiddleName + initialOfLastName);
    }
}

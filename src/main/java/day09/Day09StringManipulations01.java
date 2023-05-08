package day09;

import java.util.Scanner;

public class Day09StringManipulations01 {
    /*
        Example 1: Type code to print just the unique characters in a String
        "Hello" ==> Heo
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String to print unique characters: ");
        String str = input.nextLine();

        System.out.println(str.indexOf("e"));//1
        System.out.println(str.lastIndexOf("e"));//1

        char c = str.charAt(0);
        if (str.indexOf(c) == str.lastIndexOf(c)) {
            System.out.print(c);
        }

        char d = str.charAt(1);
        if (str.indexOf(d) == str.lastIndexOf(d)) {
            System.out.print(d);
        }

        char e = str.charAt(2);
        if (str.indexOf(e) == str.lastIndexOf(e)) {
            System.out.print(e);
        }

        char f = str.charAt(3);
        if (str.indexOf(f) == str.lastIndexOf(f)) {
            System.out.print(f);
        }

        char g = str.charAt(4);
        if (str.indexOf(g) == str.lastIndexOf(g)) {
            System.out.print(g);
        }
    }
}

package day10;

import java.util.Scanner;

public class Day10ForLoop03 {

    public static void main(String[] args) {
        //Type code to print unique characters in a String.
        //Alabama ==> Albm
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String to see unique characters: ");
        String uniques = input.nextLine();

        for (int i = 0; i <= uniques.length() - 1; i++) {
            char c = uniques.charAt(i);
            if (uniques.indexOf(c) == uniques.lastIndexOf(c)) {
                System.out.print(c);
            }
        }

        System.out.println();

        /*
            Type code to print the following image on the console
                X X X X X
                X X X X X
                X X X X X
        */
        System.out.println("Enter the number of columns and rows: ");
        int col = input.nextInt();
        int row = input.nextInt();

        for (int i = 1; i <= row; i++) {
            String s = "";
            for (int k = 1; k <= col; k++) {
                s = s + "X ";
            }
            System.out.println(s);
        }
    }
}

package day04;

import java.util.Scanner;

public class Day04Scanner {
    /*
        Scanner class is used to interact with user.
        To interact with user by using Scanner Class follow the steps:
        1)Create a Scanner Class object
        2)Give a message to the user
        3)Put the data coming from user into memory
    */
    public static void main(String[] args) {
        //1)Create a Scanner Class object
        Scanner input = new Scanner(System.in);

        //2)Give a message to the user
        System.out.println("Enter your age: ");

        //3)Put the data coming from user into memory
        int age = input.nextInt();
        System.out.println(age);
    }
}

package day10;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Day10StringManipulations01 {
    //Note: Index of last character equals to length()-1 everytime
    public static void main(String[] args) {
        //Ask user to enter his full name, then create a unique id for the user.
        //id should contain first 2 characters of the first name and last 2 characters of the last name.
        //Use the current date time at the end of the id.
        //Example: Tom Hanks ==> Toks20220528180434
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name...");
        String name = input.nextLine();

        String firstTwo = name.substring(0, 2);
        System.out.println(firstTwo);//To

        String lastTwo = name.substring(name.length() - 2);
        System.out.println(lastTwo);//ks

        LocalDateTime currentDateTime = LocalDateTime.now();
        String expectedCurrentDataTime = currentDateTime.toString().substring(0, 19).replaceAll("[^0-9]", "");
        System.out.println(firstTwo + lastTwo + expectedCurrentDataTime);
    }
}

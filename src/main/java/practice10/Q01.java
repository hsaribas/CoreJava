package practice10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q01 {
    /*
	    A list has elements “M”, “K” and “P”. Ask user to enter a letter.
		If the letter exists in list, convert it to "Got it", otherwise add it to the list.
	*/
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("M");
        list.add("K");
        list.add("P");
        System.out.println(list);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        String letter = input.next().trim().substring(0, 1).toUpperCase();

        if (list.contains(letter)) {
            list.set(list.indexOf(letter), "Got It");
        } else {
            list.add(letter);
        }
        System.out.println(list);
    }
}

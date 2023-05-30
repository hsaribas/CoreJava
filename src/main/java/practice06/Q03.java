package practice06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03 {
    /*
        Type a code to ask user to enter the integer elements and add elements into the list.
        Ask user to enter the elements to remove, then remove that element from list.
        Ask user to enter the element to update, then update it.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer elements: ");
        List<Integer> list = new ArrayList<>();

        while (true) {
            System.out.println("To add elements type 'add'\n" +
                    "To update elements type 'set'\n" +
                    "To remove elements type 'remove'\n" +
                    "To quit type 'quit'");
            String option = input.next();

            if (option.equalsIgnoreCase("add")) {
                System.out.println("Enter an integer to add it into list: ");
                int el = input.nextInt();
                list.add(el);
            } else if (option.equalsIgnoreCase("set")) {
                System.out.println("Enter the element you want to update: ");
                int updateEl = input.nextInt();
                System.out.println("Enter the new element you want to put: ");
                int newEl = input.nextInt();
                list.set(list.indexOf(updateEl), newEl);
            } else if (option.equalsIgnoreCase("remove")) {
                System.out.println("Enter the element you want to remove: ");
                int removeEl = input.nextInt();
                list.remove((Integer) removeEl);
            } else if (option.equalsIgnoreCase("quit")) {
                break;
            } else {
                System.out.println("Enter a valid option");
            }
            System.out.println(list);
        }
        System.out.println("Good Bye!");
    }
}

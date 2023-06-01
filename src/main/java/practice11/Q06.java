package practice11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q06 {
    /*
        Create a method to count the number of each words in a String one by one.
            Input: "Ali came to school and Ayse came to school"
            Output: Ali=1 came=2 to=2 school=2 and=1 Ayse=1
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();

        countTheWords(str);
    }

    public static void countTheWords(String str) {
        Map<String, Integer> map = new HashMap<>();

        String[] arr = str.split(" ");
        for (String w : arr) {
            if (map.containsKey(w)) {
                map.put(w, map.get(w) + 1);
            } else {
                map.put(w, 1);
            }
        }
        System.out.println(map);
    }
}

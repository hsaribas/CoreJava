package practice08;

import java.util.Arrays;

public class Q02 {
    /*
        Create a method accepts a name as a parameter and prints the name as a char array. (Do not use toCharArray() method)
        Input: John
        Output: [J, o, h, n]
    */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(convertToCharArray("John Doe")));
    }

    public static char[] convertToCharArray(String name) {
        String str = name.trim().replace(" ", "");
        char[] arr = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }
}

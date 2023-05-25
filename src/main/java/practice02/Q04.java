package practice02;

public class Q04 {

    public static void main(String[] args) {
        //Print the characters of all the numbers from 0-255.
        for (int i = 0; i < 256; i++) {
            char ch = (char) i;
            System.out.println(i + " = " + ch);
        }
    }
}

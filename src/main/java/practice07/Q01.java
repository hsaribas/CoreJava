package practice07;

public class Q01 {
    //Check if a string is Palindrome or not.
    public static void main(String[] args) {
        /*
        StringBuilder sb1 = new StringBuilder("12321");
        String str = sb1.toString();
        String reversed = sb1.reverse().toString();
        System.out.println("Is String palindrome? " + str.equals(reversed));
        */

        String str = "civic";
        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println("Is string Palindrome? " + str.equals(reversedStr));
    }
}

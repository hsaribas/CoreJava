package day11;

public class Day11WhileLoop02 {
    //Type code to check if a given integer is palindrome or not.
    //Palindrome: 121 <==> 121,  123321 <==> 123321,  nalan <==> nalan
    public static void main(String[] args) {
        int i = 123321;
        String strI = String.valueOf(i);
        StringBuilder reverse = new StringBuilder();

        int idx = strI.length() - 1;
        while (idx > -1) {
            reverse.append(strI.charAt(idx));
            idx--;
        }
        if (strI.equals(reverse.toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

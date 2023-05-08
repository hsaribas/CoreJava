package day09;

public class Day09StringManipulations03 {
    /*
        String shirtPrice = "$12.99";
        String bookPrice = "$35.99";
        Type code to find the sum of the shirt and book prices.
    */
    public static void main(String[] args) {
        String shirtPrice = "$12.99";
        String bookPrice = "$35.99";

        String s = shirtPrice.replace("$", "");
        String b = bookPrice.replace("$", "");

        double shirt = Double.parseDouble(s);
        double book = Double.parseDouble(b);

        System.out.println(shirt + book);
    }
}

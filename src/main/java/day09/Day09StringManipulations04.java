package day09;

public class Day09StringManipulations04 {
    //Type a code to find the number of punctuation marks used in a String.
    public static void main(String[] args) {
        String str = "Wow!... Ali is 13 years old, and he is a university student.";
        int totalNumOfChars = str.length();
        System.out.println(totalNumOfChars);
        String strWithoutPunct = str.replaceAll("\\p{Punct}", "");
        System.out.println(strWithoutPunct.length());
        System.out.println(totalNumOfChars - strWithoutPunct.length());
        System.out.println(str.replaceAll("\\P{Punct}", "").length());

        //Create a method prints greeting by using the given name.
        // Ali => Hi Ali       Tom => Hi Tom
        System.out.println(greetingUser("Ali"));

        //Create a method makes the decimal part has 5 digits.
        System.out.println(limitDecimalPart(10.5f));
    }

    public static String greetingUser(String name) {

        return String.format("Hi %s How are you?", name);
    }

    public static String limitDecimalPart(float number) {

        return String.format("The price is %.5f", number);
    }
}

package day08;

public class Day08StringManipulation01 {
    //If your code gives correct output for some data and if it doesn't give
    // correct data for some others it can not be accepted. That kind of codes are called "Hard Coding".
    //If your code works for all data, it is called "Dynamic code". Every time you must
    // make your code "Dynamic code".
    public static void main(String[] args) {
        //Count the alphabetical characters in a given String
        //Tom12 Hanks!...
        String name = "   Tom12 Hanks!...  ";
        int numOfLetters = name.replaceAll("[^A-Za-z]", "").length();
        System.out.println("numOfLetters: " + numOfLetters);//8

        //Get the initial from full name. (Middle name is out of scope)
        //Tom Hanks == TH
        String fullName = "   tom hanks     ";

        //trim() method removes the spaces just from the beginning and from the end. It does not touch spaces in the middle.
        //substring(startingIndex, endingIndex) method is used to get a specific part of string.
        //starting index is inclusive, ending index is exclusive.
        //Note: The variables used inside the method parenthesis are called "Parameters".
        //Note: The values used inside the method parenthesis are called "Arguments".
        String initialOfFirstName = fullName.trim().substring(0, 1).toUpperCase();
        System.out.println("initial: " + initialOfFirstName);//T

        //split() method is used to split a string into specific parts by using a specific characters.
        //The characters used to split the string will not be visible after splitting.
        String initialOfLastName = fullName.trim().split(" ")[1].substring(0, 1).toUpperCase();
        System.out.println("initialOfLastName: " + initialOfLastName);
        System.out.println(initialOfFirstName + initialOfLastName);//TH

        //Example 3: Fix the day names format like "Sunday".
        //"sunday" ==> "Sunday"     "SUNDAY" ==> "Sunday"
        String dayName = "    sUNDAY  ";
        String initialOfDayName = dayName.trim().substring(0, 1).toUpperCase();
        String otherCharsOfDayName = dayName.trim().substring(1).toLowerCase();
        System.out.println(initialOfDayName + otherCharsOfDayName);

        //Example 4: Make all digits except last 4 digits of a credit card invisible by using "*".
        //**** **** **** 1234
        //Note 1: \\S Different from space(Uppercase means 'different from')
        //Note 2: \\s This has positive meaning, (Space characters)
        String creditCardNumber = "1234 1234 1234 1234";
        String invisiblePart = creditCardNumber.substring(0, 15).replaceAll("\\d", "*");
        String visiblePart = creditCardNumber.substring(15);
        System.out.println(invisiblePart + visiblePart);

        //Example 5: Count how many characters different from space were used in a String.
        //"Tom Hanks was born in 1975."
        //1. Way:
        String s = "Tom Hanks was born in 1975.";
        int numOfChars = s.replace(" ", "").length();
        System.out.println(numOfChars);

        //2. Way:
        int numOfCharacters = s.replace(" ", "").split("").length;
        System.out.println(numOfCharacters);
    }
}

package day06;

public class Day06Ternary {

    public static void main(String[] args) {
        //Type code to check if a number is positive or not
        int x = 12;

        //1.Way: By using if-else
        if (x > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Not positive");
        }

        //2.Way: By using ternary
        String result1 = x > 0 ? "Positive" : "Not positive";
        System.out.println(result1);

        //Type code to check if an integer has 3 digits or not
        int y = 123;
        int absY = Math.abs(y);

        //Using '>' is better than using '>=' because there is single condition in the first
        String result2 = absY > 99 && absY < 1000 ? "It has 3 digits" : "It has no 3 digits";
        System.out.println(result2);

        //Type code to check following conditions for state abbreviations in the USA
        //1)It should have 2 characters  2)It should have just uppercase
        String s = "FL";
        String result3 = s.length() == 2 && s.replaceAll("[A-Z]", "").length() == 0 ? "Valid abbreviation" : "Invalid abbreviation";
        System.out.println(result3);
    }
}

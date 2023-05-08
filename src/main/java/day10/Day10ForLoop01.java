package day10;

public class Day10ForLoop01 {

    public static void main(String[] args) {
        //Type "Hi!" on the console 5 times
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");

        //By using "Loops" you can do repeated actions without repeating your codes
        //There are 4 loops; 1)for-loop 2)while-loop 3)do-while-loop 4)for-each-loop

        System.out.println("=====================");

        //1)for-loop
        // Starting value  Condition to run loop  Increment/Decrement
        for (int i = 1;           i <= 5;                i++) {
            System.out.println("Hi");
        }

        //Example 1: Type integers from 10 to 3 on the console by using for loop.
        for (int i = 10; i > 2; i--) {
            System.out.print(i + " ");
        }

        //Example 2: Type even integers from 4 to 15 on the console by using for-loop.
        //1.Way: Recommended
        for (int i = 4; i < 16; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        //2.Way: Not recommended
        for (int i = 4; i < 16; i += 2) {
            System.out.print(i + " ");
        }

        //Example 3 : Type odd integers from 4 to 15 by using for-loop.
        for (int i = 4; i < 16; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        //Example 4: Print all integers from 10 to 32 except 17 on the console.
        //1.Way:
        for (int i = 10; i < 33; i++) {
            if (i != 17) {
                System.out.print(i + " ");
            }
        }
        //2.Way:
        for (int i = 10; i < 33; i++) {
            if (i == 17) {
                continue;//To skip some steps in a loop we use "continue" keyword
            }
            System.out.print(i + " ");
        }

        //Example 5: Print all the integers from 10 to 32 except if the integer is less than 21 greater than 18.
        for (int i = 10; i < 33; i++) {
            if (i > 18 && i < 21) {
                continue;
            }
            System.out.println(i + " ");
        }

        //Example 6: Print String characters one by one on the console. If you see "x" stop printing.
        //Example: Publix is the best ==> Publi     Tom Hanks ==> Tom Hanks
        String str = "Publix is the best";
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == 'x') {
                break;
            }
            System.out.println(str.charAt(i));
        }
    }
}

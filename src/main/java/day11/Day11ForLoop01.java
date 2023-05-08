package day11;

public class Day11ForLoop01 {

    public static void main(String[] args) {
        //Type code to find the sum of integers from 10 to 14.
        int sum = 0;
        for (int i = 10; i < 15; i++) {
            sum = sum + i;
        }
        System.out.println(sum);//If you put this inside the loop body you will see the sum value for every loop.
        //If you want to see only final sum, put it after the loop body.

        //Type code to find the multiplication of integers from 10 to 14.
        int multiplication = 1;
        for (int i = 10; i < 15; i++) {
            multiplication = multiplication * i;
            System.out.println(multiplication);
        }
    }
}

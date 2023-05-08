package day11;

public class Day11WhileLoop03 {

    public static void main(String[] args) {
        //Type code to print the sum of the digits of an integer.
        int i = 237;
        int sum = 0;
        while (i > 0) {
            sum = sum + i % 10;
            i /= 10;//i=i/10
            System.out.println(sum);
        }

        //Type code to create a multiplication table for any given number.
        //3x1=3   3x2=6   ..............   3x10=30
        int j = 3;
        int m = 1;
        while (m < 11) {
            System.out.println(j + "X" + m + " = " + (j * m));
            m++;
        }
    }
}

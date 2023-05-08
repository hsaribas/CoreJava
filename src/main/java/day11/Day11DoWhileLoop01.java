package day11;

public class Day11DoWhileLoop01 {

    public static void main(String[] args) {
        int i = 1;
        while (i < 1) {
            System.out.println("While Loop");
            i++;
        }
        //This code block will not be executed, because "i" is not less than 1.

        int k = 1;
        do {
            System.out.println("Do While Loop");
            k++;
        } while (k < 1);
        //Zero execution is possible in while-loop. But it is impossible in do-while-loop.
        //Do-while-loop body is going to execute at least once.
    }
}

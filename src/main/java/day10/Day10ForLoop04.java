package day10;

public class Day10ForLoop04 {
    /*
        Print the following structure on the console
            Week: 1
                Day: 1
                Day: 2
                Day: 3
            Week: 2
                Day: 1
                Day: 2
                Day: 3
    */
    public static void main(String[] args) {
        int weeks = 4;
        int days = 7;

        for (int i = 1; i <= weeks; i++) {
            System.out.println("Week: " + i);
            for (int k = 1; k <= days; k++) {
                System.out.println(" Day: " + k);
            }
        }
    }
}

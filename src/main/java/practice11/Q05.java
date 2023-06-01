package practice11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q05 {
    /*
        - Type a program that displays all the 7-day earnings of the market on a daily basis.
        - Type a method that calculate the average amount the market earns this week.
        - Type a method that calculate which days market earns above average.
        - Type a method that calculate which days market earns below average.

        Step 1: Create an ArrayList containing the days.
        Step 2: Create an ArrayList to which we will add the daily earnings.
        Step 3: With the while loop, take the 7-day earnings from the user one by one and add them to the daily earnings ArrayList.
        Step 4: Get the average earnings with the method called averageOfEarnings().
        Step 5: Create a method called daysAboveAverage().
                Compare all days with average earnings with for loop.
                If higher than average earnings, return those days.
        Step 6: Create a method called daysBelowAverage().
                Compare all days with average earnings with for loop.
                If less than average earnings, return those days.
    */
    static List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
    static List<Double> dailyEarnings = new ArrayList<>();
    static double totalEarnings = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day = 0;

        while (day < 7) {
            System.out.println("Enter the earning of " + days.get(day) + ": ");
            double todaysEarning = scan.nextDouble();
            dailyEarnings.add(todaysEarning);
            totalEarnings += todaysEarning;
            day++;
        }

        System.out.println("Daily Earnings" + dailyEarnings);
        System.out.println("Total Earnings: " + totalEarnings);
        System.out.println("Average Of Earnings: " + averageOfEarnings());
        System.out.println("Days Above Average: " + daysAboveAverage());
        System.out.println("Days Below Average: " + daysBelowAverage());
    }

    private static double averageOfEarnings() {

        return totalEarnings / 7;
    }

    private static String daysAboveAverage() {
        StringBuilder daysAboveAverage = new StringBuilder();

        for (int i = 0; i < dailyEarnings.size(); i++) {
            if (dailyEarnings.get(i) > averageOfEarnings()) {
                daysAboveAverage.append(days.get(i)).append(" ");
            }
        }
        return daysAboveAverage.toString();
    }

    private static String daysBelowAverage() {
        StringBuilder daysBelowAverage = new StringBuilder();

        for (int i = 0; i < dailyEarnings.size(); i++) {
            if (dailyEarnings.get(i) < averageOfEarnings()) {
                daysBelowAverage.append(days.get(i)).append(" ");
            }
        }
        return daysBelowAverage.toString();
    }
}

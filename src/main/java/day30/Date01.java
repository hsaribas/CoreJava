package day30;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Date01 {

    public static void main(String[] args) {
        //How to create date object?
        LocalDate currentDate1 = LocalDate.now();
        System.out.println("Current Date = " + currentDate1);//2022-09-20

        System.out.println(currentDate1.plusDays(5));//2022-09-25
        System.out.println(currentDate1.plusMonths(3));//2022-12-20
        System.out.println(currentDate1.plusYears(2));//2024-09-20
        System.out.println(currentDate1.plusYears(1).plusMonths(2).plusDays(6));//2023-11-26

        System.out.println(currentDate1.getYear());//2022
        System.out.println(currentDate1.getMonth());//SEPTEMBER
        System.out.println(currentDate1.getMonthValue());//9
        System.out.println(currentDate1.getDayOfMonth());//20
        System.out.println(currentDate1.getDayOfYear());//263
        System.out.println(currentDate1.getDayOfWeek());//TUESDAY

        System.out.println(currentDate1.minusDays(12));//2022-09-08
        System.out.println(currentDate1.minusMonths(2));//2022-07-20
        System.out.println(currentDate1.minusYears(50));//1972-09-20

        LocalDate date1 = LocalDate.of(1996, 3, 15);
        System.out.println(date1.isAfter(currentDate1));//false
        System.out.println(date1.isBefore(currentDate1));//true

        //How to create time object?
        LocalTime currentTime1 = LocalTime.now();
        System.out.println("Current Time = " + currentTime1);//19:08:36.066691

        for (int i = 0; i < 1000000000; i++) {
            i++;
        }

        LocalTime currentTime2 = LocalTime.now();
        System.out.println("Current Time 2 = " + currentTime2);
        System.out.println("Nano difference " + (currentTime2.getNano() - currentTime1.getNano()));//48972000

        System.out.println(currentTime1.plusHours(2));//21:08:36.066691
        System.out.println(currentTime1.plusSeconds(12));//19:09:35.185149700
        System.out.println(currentTime1.plusMinutes(35));//19:45:15.660999200

        System.out.println(currentTime1.now(ZoneId.of("Japan")));//01:13:08.374805600
        System.out.println(currentTime1.now(ZoneId.of("America/Cordoba")));//13:14:44.006123200
        System.out.println(currentTime1.now(ZoneId.of("Turkey")));//19:15:44.121506500

        //How to create an object from LocalDateTime?
        LocalDateTime dateTime1 = LocalDateTime.now();
        System.out.println("Date Time = " + dateTime1);//2022-09-20T19:17:25.883575300

        //How to format date?
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MM-yy");//M => Months, m => minutes
        //MMM => First 3 letters of month
        //MM => The number of the month
        //MMMM => The full month name
        //M => The number of month without 0 at the beginning
        System.out.println(dtf1.format(dateTime1));//20-09-22

        //How to format time?
        LocalTime localTime = LocalTime.now();
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm a");//hh => am-pm time format
        //HH => 24 hours time format
        //a => to put am-pm at the end
        System.out.println(dtf2.format(localTime));//19:29 PM

        //How to find difference between two dates?
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(1995, 4, 19);

        //If you want to get year, month and day together, use the code below.
        Period age = Period.between(d2, d1);
        System.out.println("Age = " + age);//P27Y5M1D

        //If you want to get specific date part, use one of get method.
        int ageYear = Period.between(d2, d1).getYears();
        System.out.println(ageYear);//27
    }
}

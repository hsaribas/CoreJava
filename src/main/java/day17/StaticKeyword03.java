package day17;

import java.time.LocalDate;

public class StaticKeyword03 {
    /*
        Create unique student ids for every registered student.
        Tom Hanks registered to Math Course(901) ==> TH20229011001
    */
    public static int counter = 1000;

    public StaticKeyword03() {
        counter++;
    }

    public static String setStdId(String stdName, String courseName) {
        String firstInitial = stdName.split(" ")[0].substring(0, 1);
        String lastInitial = stdName.split(" ")[1].substring(0, 1);
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        int courseCode = 0;

        switch (courseName.toLowerCase()) {
            case "math":
                courseCode = 901;
                break;
            case "science":
                courseCode = 902;
                break;
            case "art":
                courseCode = 903;
                break;
            case "computer":
                courseCode = 904;
                break;
            default:
                System.out.println(courseName + " does not exist");
        }
        return firstInitial + lastInitial + year + courseCode + counter;
    }
}

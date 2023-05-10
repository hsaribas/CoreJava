package day20;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Day20StringBuffer01 {
    /*
        1) String Class gives us "immutable Strings".
           If we need "mutable Strings" we can use "StringBuilder" or "StringBuffer" Classes.
        2) When Java was created, Java created "StringBuffer" Class. But then in Java 1.5 "StringBuilder"
           came to the stage.
        3) "StringBuffer" Class is multi-thread and synchronized but "StringBuilder" is not multi-thread
           and synchronized.
           Java did that to provide faster mutable String to developers.
        4) When to use "String", "StringBuilder", "StringBuffer"?
           "String": If we want to operate with small amount of data, use "String".
           "StringBuilder": If we need single-thread operations with large data in fast pace, use "StringBuilder".
           "StringBuffer": Multi-thread operations with large amount of data needs "StringBuffer".
    */
    public static void main(String[] args) {
        String str = "Java";
        LocalDateTime time1 = LocalDateTime.now();
        performanceOfStringBuffer(str);
        LocalDateTime time2 = LocalDateTime.now();
        performanceOfStringBuilder(str);
        LocalDateTime time3 = LocalDateTime.now();

        System.out.println("StringBuffer time: " + time1.until(time2, ChronoUnit.NANOS));
        System.out.println("StringBuilder time: " + time2.until(time3, ChronoUnit.NANOS));
    }

    public static StringBuffer performanceOfStringBuffer(String str) {
        StringBuffer strBuffer = new StringBuffer(str);
        strBuffer.append("abc".repeat(10000));

        return strBuffer;
    }

    public static StringBuilder performanceOfStringBuilder(String str) {
        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.append("abc".repeat(10000));

        return strBuilder;
    }
}

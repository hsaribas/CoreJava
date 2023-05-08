package day10;

public class Day10ForLoop06 {

    public static void main(String[] args) {
        //Find the sum of the digits of decimal part in a double number.
        //Ex: 23.1528 ==> 1+5+2+8=16
        double d = 23.1528;
        String sd = String.valueOf(d);
        System.out.println(sd);

        //1.Way to get decimal part
        int idx = sd.indexOf(".") + 1;
        String decimalPart1 = sd.substring(idx);
        System.out.println(decimalPart1);//String 1528

        //2.Way:
        String decimalPart2 = sd.split("\\.")[1];
        int decimalPartInt = Integer.parseInt(decimalPart2);
        System.out.println(decimalPartInt);//Integer 1528

        int sum = 0;
        for (int i = decimalPartInt; i > 0; i = i / 10) {
            sum = sum + i % 10;
        }
        System.out.println(sum);
    }
}

package practice05;

public class Q01 {
    //Create a method to print "Mark" on console by picking the characters from the "alphabet string".
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {

        System.out.println(nameIt("M", "A", "R", "K"));
    }

    public static String nameIt(String str1, String str2, String str3, String str4) {
        Q01 obj = new Q01();
        String s = obj.alphabet;

        char ch1 = s.charAt(s.indexOf(str1));
        char ch2 = s.toLowerCase().charAt(s.indexOf(str2));
        char ch3 = s.toLowerCase().charAt(s.indexOf(str3));
        char ch4 = s.toLowerCase().charAt(s.indexOf(str4));

        return "" + ch1 + ch2 + ch3 + ch4;
    }
}

package day18;

public class Day18PassByValuePassByReference {
    /*
        1) Java creates copy of values in method calls to protect original value of variables.
           That process is called "Pass By Value".
        2) By the help of "Pass By Value" we are able to protect the original value.
        3) Some programming languages may use "Pass By References", if you use that kind of languages be careful
           about protecting original values.
    */
    public static void main(String[] args) {
        int num = 10;
        System.out.println(add(num));//15
        System.out.println(num);//10

        int price = 100;
        System.out.println(doDiscount("students", price));
        System.out.println("Original price: " + price);
        System.out.println(doDiscount("veterans", price));
        System.out.println("Original price: " + price);

        String greeting = "Hello";
        System.out.println(addExclamationMark(greeting));//Hello!
        System.out.println(greeting);//Hello
    }

    public static int add(int num) {
        num = num + 5;

        return num;
    }

    public static int doDiscount(String status, int price) {
        switch (status) {
            case "students":
                price = price - 10;
                break;
            case "veterans":
                price = price - 20;
                break;
            case "seniors":
                price = price - 5;
                break;
            default:
                price = price;
        }
        return price;
    }

    public static String addExclamationMark(String greeting) {

        return greeting + "!";
    }
}

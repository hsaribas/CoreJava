package practice08;

public class Q05_Calculator {
    //Create a basic calculator, create add, subtract, multiply, divide methods.
    public void addition(double... a) {
        double sum = 0;

        for (double w : a) {
            sum += w;
        }
        System.out.println("The sum is: " + sum);
    }

    public void subtraction(double a, double b) {
        System.out.println("The difference is: " + (a - b));
    }

    public void multiplication(double... a) {
        double product = 1;

        for (double w : a) {
            product *= w;
        }
        System.out.println("The product is: " + product);
    }

    public void division(double a, double b) {
        if (b == 0) {
            System.out.println("Do not use 0 for the second parameter");
        } else {
            System.out.println("The quotient is: " + (a / b));
        }
    }
}

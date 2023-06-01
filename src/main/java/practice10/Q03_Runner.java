package practice10;

import java.util.Scanner;

public class Q03_Runner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight: ");
        double weight = input.nextDouble();
        System.out.println("Enter your height: ");
        double height = input.nextDouble();

        Q03_BMI person = new Q03_BMI(weight, height);
        person.calculationOfBMI();
    }
}

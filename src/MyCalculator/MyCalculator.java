package MyCalculator;

import java.util.Scanner;

public class MyCalculator {

    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        processMode(displayAndSelectMenu());
    }

    private static void processMode(int userInput) {

        if (userInput == 1) {

            vatCalculator();

        } else if (userInput == 2) {

            bmiCalculator();

        } else if (userInput == 3) {

            abProblem();

        } else {

            System.out.println("Error !!");

        }

    }

    private static int displayAndSelectMenu() {

        System.out.println("My Calculator 1.0 MENU");
        System.out.println("1 = VAT CALCULATOR");
        System.out.println("2 = BMI CALCULATOR");
        System.out.println("3 = A+B Problem");
        System.out.print("Please Enter Number : ");
        return sc.nextInt();

    }

    private static void vatCalculator() {

        System.out.println("Mode :  VAT CALCULATOR");
        System.out.print("Please Enter Price : ");
        double price = sc.nextDouble();
        System.out.print("Please Enter VAT (%) : ");
        double vat = sc.nextDouble();
        System.out.print("Result :  " + ((price * vat / 100) + price));

    }

    private static void bmiCalculator() {
        System.out.println("Mode :  BMI CALCULATOR");
        System.out.print("Please Enter Weight : ");
        double weight = sc.nextDouble();
        System.out.print("Please Enter Height (M) : ");
        double height = sc.nextDouble();
        System.out.print("Result :  " + (weight / (height * height)));
    }

    private static void abProblem() {
        System.out.println("Mode :  A+B Problem");
        System.out.print("Please Enter A Value : ");
        double a = sc.nextDouble();
        System.out.print("Please Enter B Value : ");
        double b = sc.nextDouble();
        System.out.print("Result :  " + (a + b));
    }
}

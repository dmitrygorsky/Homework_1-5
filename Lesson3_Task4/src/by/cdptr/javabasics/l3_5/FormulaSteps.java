package by.cdptr.javabasics.l3_5;

import java.util.Scanner;

public class FormulaSteps {

    public static void main(String[] args) {

        System.out.print("Enter number A: ");

        double a = enterNumber();

        System.out.print("Enter number B that is bigger than the one entered previously: ");

        double b = enterNumber();

        while (b < a || b == a) {

            System.out.print("Number B should be bigger than number A! Try again: ");
            b = enterNumber();

        }

        System.out.print("Enter number H that represents a step: ");

        double h = enterNumber();

        while (h > (b - a)) {

            System.out.print("Number H cannot be bigger than difference between A and B! Try again: ");
            h = enterNumber();

        }

            String leftAlignFormat = "| %-9f | %-10f |%n";

            System.out.format("+-----------+------------+%n");
            System.out.format("|     x     |     f(x)   |%n");
            System.out.format("+-----------+------------+%n");
            for (double x = a; x <= b; x += h) {
                double fx = ((2 * Math.tan(x / 2)) + 1);
                System.out.format(leftAlignFormat, x, fx);
            }
            System.out.format("+-----------+------------+%n");

        }

    //method that lets user enter a number of int type and throws error message if anything else is entered

    public static double enterNumber() {

        Scanner scan = new Scanner(System.in);

        while (!scan.hasNextDouble()) {

            System.out.print("Not a valid number! Try again: ");
            scan.next();

        }

        return scan.nextDouble();

    }

}

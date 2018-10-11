package by.cdptr.javabasics.l3_6;

import java.util.Scanner;

public class FunctionCalculate {

    public static void main(String[] args) {

        int x;

        double fx = 0;

        System.out.println("Enter a number: ");

        x = enterNumber();

        if (x <= -3) {

            fx = 9;

        } else if (x > -3 && x < 3) {

            System.out.println("x is not valid");
            System.exit(0);

        } else if (x > 3) {

            fx = 1 / (Math.pow(x, 2) + 1);

        }

        System.out.printf("x = " + x + ", "+ "F(x) = " + "%.8f",fx);

    }

    //method that lets user enter a number of int type and throws error message if anything else is entered

    static int enterNumber() {

        Scanner scan = new Scanner(System.in);

        while (!scan.hasNextInt()) {

            System.out.println("Not a valid number! Try again: ");
            scan.next();

        }

        return scan.nextInt();

    }

}

package by.cdptr.javabasics.l3_3;

import java.util.Scanner;

public class DaysInMonth {

    //method that lets user enter a number of integer type and throws error message if anything else is entered

    public static int enterNumber() {

        Scanner scan = new Scanner(System.in);

        while (!scan.hasNextInt()) {
            System.out.print("Invalid number! Try again: ");
            scan.next();
        }

        return scan.nextInt();
    }

    //method that checks if parameter (integer type) falls in range between 1 and 12

    public static int validMonth(int b) {

        while (b < 1 || b > 12) {

            System.out.print("There's no such month! Try again: ");
            b = DaysInMonth.enterNumber();

        }

        return b;

    }

    //method that returns days quantity in a certain month of a certain year (year and month values of integer type are used as parameters)

    public static int countDaysQuantity(int d, int e) {

        int daysQTY = 0;

        switch (d) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 12:
                daysQTY = 31;
                break;

            case 2:
                if (e % 4 == 0 && e % 100 != 0 || e % 400 == 0) {

                    daysQTY = 29;

                } else {

                    daysQTY = 28;

                }
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                daysQTY = 30;
                break;
            default:
                System.out.println("Invalid month number. Sorry");
                System.exit(1);

        }

        return daysQTY;

    }

    //method that returns certain month name (month value of integer type is used as parameter)

    public static String nameMonth(int z) {

        String monthName = "";

        switch (z) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "Novermber";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                System.out.println("Invalid month number. Sorry");
                System.exit(1);

        }

        return monthName;


    }

}

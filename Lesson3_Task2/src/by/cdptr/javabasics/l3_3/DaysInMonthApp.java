package by.cdptr.javabasics.l3_3;

public class DaysInMonthApp {

    public static void main(String[] args) {

        System.out.print("Enter a year: ");

        int a = DaysInMonth.enterNumber();

        System.out.print("Now enter a month (from 1 to 12): ");

        int b = DaysInMonth.validMonth(DaysInMonth.enterNumber());

        System.out.println("There are " + DaysInMonth.countDaysQuantity(b, a) + " days in the month of " + DaysInMonth.nameMonth(b) + ", " + a);

    }

}
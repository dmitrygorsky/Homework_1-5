package by.cdptr.javabasics.l3_4;

import java.util.Scanner;

public class NatChislo {

    public static void main(String[] args) {

        System.out.print("Введите число: ");

        int number = enterNumber();

        System.out.println(solution(number));

    }

    //method that lets user enter a number of integer type and throws error message if anything else is entered

    public static int enterNumber() {

        Scanner scan = new Scanner(System.in);

        while (!scan.hasNextInt()) {
            System.out.print("Введено неверное число! Попробуйте снова: ");
            scan.next();
        }

        return scan.nextInt();
    }

    //method that checks if there is an even number in a given number of int type which is used as a parameter

    public static String solution(int b) {

        String String1 = "";

        while (b != 0){

            int digit = b % 10;

            if (digit % 2 != 0) {

                String1 = "В числе нет четных цифр";

            } else {

                String1 = "В числе есть четная цифра";
                break;

            }

            b = b / 10;

        }

        return String1;
    }

}


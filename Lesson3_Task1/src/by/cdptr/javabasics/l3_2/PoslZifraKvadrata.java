package by.cdptr.javabasics.l3_2;

import java.util.Scanner;

public class PoslZifraKvadrata {

    public static void main(String[] args) {

        int number, poslZifraKv;

        number = ChisloUsera();

        poslZifraKv = PoslZifraKva(number);

        System.out.println("Последняя цифра квадрата числа "+ number +" равняется "+
                poslZifraKv);
    }

    //method that lets enter a number of integer type and throws error message if anything else is entered

    public static int ChisloUsera() {

        Scanner scan = new Scanner(System.in);

        while (!scan.hasNextInt()) {
            System.out.println("Введено невалидное число! Попробуйте еще раз");
            scan.next();
        }

        return scan.nextInt();
    }

    //method that counts the last digit of a given number being squared

    public static int PoslZifraKva(int c) {

        int result = 0;

        c = c % 10;
        switch (c) {
            case 0:
                result = 0;
                break;
            case 1:
                result = 1;
                break;
            case 2:
                result = 4;
                break;
            case 3:
                result = 9;
                break;
            case 4:
                result = 6;
                break;
            case 5:
                result = 5;
                break;
            case 6:
                result = 6;
                break;
            case 7:
                result = 9;
                break;
            case 8:
                result = 4;
                break;
            case 9:
                result = 1;
                break;
            default:
                System.out.println("Что-то не то с программой.");
                break;
        }

        return result;
    }
}

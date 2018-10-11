package by.cdptr.javabasics.l4_2;

import java.util.Random;
import java.util.Scanner;

public class MassivKratnyyK {

    //method that lets user enter a number of int type and throws error message if anything else is entered

    public static int enterNumber() {

        Scanner scan = new Scanner(System.in);

        while (!scan.hasNextInt()) {

            System.out.println("Введено невалидное число! Попробуйте снова");
            scan.next();

        }

        return scan.nextInt();

    }

    //method that checks if given number of int type (which is used as a parameter) is less or equals to zero
    //and throws error message if yes, letting user enter another number using enterNumber() method

    public static int noZerosAllowed(int i) {

        while (i <= 0) {

            System.out.println("Число не может быть меньше нуля либо равно ему! Попробуйте снова");
            i = enterNumber();

        }

        return i;

    }

    //method that fills an array with random numbers, the length of array is taken from parameter of int type

    public static int[] fillArrayWithRandomNumber(int x) {

        int[] arr = new int[x];

        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {

            arr[i] = rand.nextInt(100);

        }

        return arr;

    }

    //method that goes through given array of int type (used as parameter) searching for number(s) that is (are)
    //multiple to given value k of int type (used as parameter)

    public static int summaKratnyh(int[] arr, int k) {

        int result = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % k == 0) {

                result += arr[i];

            }

        }

        return result;

    }

}


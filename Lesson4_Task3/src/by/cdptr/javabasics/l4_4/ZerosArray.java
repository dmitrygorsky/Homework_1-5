package by.cdptr.javabasics.l4_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ZerosArray {

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

    public static int noZerosAllowed(int x) {

        while (x <= 0) {

            System.out.println("Число не может быть меньше нуля либо равно ему! Попробуйте снова");
            x = enterNumber();

        }

        return x;

    }

    //method that fills an array with random numbers, the length of array is taken from parameter of int type

    public static int[] fillArrayWithRandomNumbers(int x) {

        int[] arr = new int[x];

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {

            arr[i] = random.nextInt(100);

        }

        return arr;

    }

    //method that returns the number of zeros in given array of int type (used as parameter) as a value of int type

    public static int countZeros(int[] arr) {

        int k = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {

                k += 1;

            }

        }

        return k;

    }

    //method that creates a new array of int type and puts an index of zero in given array of int type (used as parameter)
    //given value k of int type is used as parameter and represents newly created array's length
    //returns newly created array of int type

    public static int[] zerosToArray(int[] arr, int k) {

        int[] arr2 = new int[k];

        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {

                arr2[j] = i;

                j += 1;

            }

        }

        return arr2;

    }

    //method that throws an explicit error message if no zeros were found in given array of int type (used as parameter)
    //and prints out the given array otherwise

    public static void returnResult(int[] arr) {

        if (arr.length == 0) {

            System.out.println("Нули в заданном массиве не обнаружены");

        } else {

            System.out.println(Arrays.toString(arr));

        }

    }

}


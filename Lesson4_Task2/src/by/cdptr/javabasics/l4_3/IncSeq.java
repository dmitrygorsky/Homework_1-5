package by.cdptr.javabasics.l4_3;

import java.util.Random;
import java.util.Scanner;

public class IncSeq {

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

    //method that checks if array presents an increasing sequence (given array of int type is used as parameter)
    //returns true if sequence is increasing, returns false otherwise

    public static boolean checkIncrease(int[] arr) {

        boolean b = true;

        for (int i = 0; i < arr.length; i++) {

            if ((i + 1) < arr.length && arr[i] > arr[i + 1]) {

                b = false;
                break;

            }

        }

        return b;

    }

    //method that checks if array presents a decreasing sequence (given array of int type is used as parameter)
    //returns true if sequence is decreasing, returns false otherwise

    public static boolean checkDecrease(int[] arr) {

        boolean c = true;

        for (int i = 0; i < arr.length; i++) {

            if ((i + 1) < arr.length && arr[i] < arr[i + 1]) {

                c = false;
                break;

            }

        }

        return c;

    }

    //method that returns an explicit message about whether sequence is increasing, decreasing or none of those
    //as a string (given boolean values are used as parameters)

    public static String returnResult(boolean x, boolean y) {

        String strInc = "Последовательность является возрастающей";

        String strChaotic = "Последовательность не является ни возрастающей, ни убывающей";

        String strDec = "Последовательность является убывающей";

        if (x == true && y == false) {

            return strInc;

        } else if (x == false && y == true) {

            return strDec;

        } else {

            return strChaotic;

        }

    }

}


package by.cdptr.javabasics.l5_1;

import java.util.Scanner;

public class Drobi {

    private int num = 1;
    private int den = 1;

    //default constructor

    public Drobi() {

    }

    //constructor with parameters

    public Drobi(int num, int den) {

        this.num = num;
        this.den = den;

    }

    //method that returns a numerator

    public int getNum() {

        return num;

    }

    //method that sets given value of int type to a numerator

    public void setNum(int num) {

        this.num = num;

    }

    //method that returns a denominator

    public int getDen() {

        return den;

    }

    //method that sets given value of int type to a denominator

    public void setDen(int den) {

        this.den = den;

    }

    //method that passes given object values to Drobi class variables num and den

    public void add(Drobi drob) {

        this.num = drob.num;

        this.den = drob.den;

    }

    //method that initializes array with objects of Drobi class

    public static Drobi[] initMassive(int k, Drobi[] arr) {

        for (int i = 0; i < k; i++) {

            arr[i] = new Drobi();

        }

        return arr;

    }

    //method that lets user enter a number of int type, throws error message if anything else is entered
    //accepts a message of String type to make it clearer for user what should be entered

    public static int enterNumber(String msg) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите " + msg);

        while (!scan.hasNextInt()) {

            System.out.println("Вы ввели неверное число!");
            scan.next();

        }

        return scan.nextInt();

    }

    //mathod that adds objects to given array of Drobi type
    //accepts given value k of int type as array length

    public static Drobi[] putValuesIntoMassive(int k, Drobi[] arr) {

        for (int i = 0; i < k; i++) {

            int n = Drobi.enterNumber("числитель");

            int m = Drobi.enterNumber("знаменатель");

            while (m == 0) {

                System.out.println("Знаменатель не может быть равен нулю!");
                m = Drobi.enterNumber("знаменатель");

            }

            Drobi drob = new Drobi(n, m);

            arr[i].add(drob);

        }

        return arr;

    }

    //method that prints out objects values to console

    public static void printResult(int k, Drobi[] arr) {

        System.out.println("Введенные дроби:");

        for (int i = 0; i < k; i++) {

            System.out.println(arr[i].getNum() + "/" + arr[i].getDen());

        }

    }

}

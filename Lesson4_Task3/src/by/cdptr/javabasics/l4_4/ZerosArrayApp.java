package by.cdptr.javabasics.l4_4;

import java.util.Arrays;

public class ZerosArrayApp {

    public static void main(String[] args) {

        System.out.println("Введите число элементов в массиве: ");

        int[] arr = ZerosArray.fillArrayWithRandomNumbers(ZerosArray.noZerosAllowed(ZerosArray.enterNumber()));

        System.out.println("Заданный массив - " + Arrays.toString(arr));

        ZerosArray.returnResult(ZerosArray.zerosToArray(arr, ZerosArray.countZeros(arr)));

    }

}

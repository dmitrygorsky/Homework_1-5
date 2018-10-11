package by.cdptr.javabasics.l4_2;

import java.util.Arrays;

public class MassivKratnyyK_App {

    public static void main(String[] args) {

        System.out.println("Введите число элементов в массиве:");

        int x = MassivKratnyyK.noZerosAllowed(MassivKratnyyK.enterNumber());

        System.out.println("Введите число, которому должны быть кратны элементы массива: ");

        int k = MassivKratnyyK.noZerosAllowed(MassivKratnyyK.enterNumber());

        int[] arr = MassivKratnyyK.fillArrayWithRandomNumber(x);

        int result = MassivKratnyyK.summaKratnyh(arr, k);

        System.out.println("Массив " + Arrays.toString(arr) + "\nСумма элементов, кратных " + k + ", составляет " + result);

    }

}

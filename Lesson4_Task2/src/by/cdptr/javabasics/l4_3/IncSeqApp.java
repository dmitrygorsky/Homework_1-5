package by.cdptr.javabasics.l4_3;

import java.util.Arrays;

public class IncSeqApp {

    public static void main(String[] args) {

        System.out.println("Введите число элементов в последовательности: ");

        int[] arr = IncSeq.fillArrayWithRandomNumbers(IncSeq.noZerosAllowed(IncSeq.enterNumber()));

        System.out.println("Заданная последовательность - " + Arrays.toString(arr));

        System.out.println(IncSeq.returnResult(IncSeq.checkIncrease(arr), IncSeq.checkDecrease(arr)));

    }

}

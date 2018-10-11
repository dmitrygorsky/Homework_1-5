package by.cdptr.javabasics.l2_3;

import java.util.*;

public class SqaureAndCircle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double radius;

        System.out.println("Введите радиус: ");

        while (!scan.hasNextDouble()) {
            System.out.println("Введено невалидное число! Попробуйте еще раз");
            scan.next();
        }

        radius = scan.nextDouble();


        double circle = 2 * Math.PI * radius;

        double square = Math.PI * Math.pow(radius, 2);

        System.out.printf("Окружность равняется " + "%.2f", circle);
        System.out.printf("\nПлощадь равняется " + "%.2f", square);
    }

}

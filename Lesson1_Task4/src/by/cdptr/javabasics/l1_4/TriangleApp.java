package by.cdptr.javabasics.l1_4;

public class TriangleApp {

    public static void main(String[] args) {

        double a = 32;
        double b = 47;

        double hypo = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        double square =  (a * b) / 2;

        System.out.printf("Гипотенуза треугольника - " + "%.2f",hypo);
        System.out.printf("\nПлощадь треугольника - " + "%.2f",square);

    }

}

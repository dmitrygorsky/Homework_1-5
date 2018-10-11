package by.cdptr.javabasics.l2_1;

public class FormulaCalculateApp {

    public static void main(String[] args) {

        double a = 0;

        double b = 0;

        double c = 0;

        System.out.println("Please enter number A: ");

        a = FormulaCalculate.userNumber(a);

        System.out.println("Please enter number B: ");

        b = FormulaCalculate.userNumber(b);

        System.out.println("Please enter number C: ");

        c = FormulaCalculate.userNumber(c);

        System.out.printf("The result is " + "%.2f", FormulaCalculate.formulaResult(a, b, c));

    }
}

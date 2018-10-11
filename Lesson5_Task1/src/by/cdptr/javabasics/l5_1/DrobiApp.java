package by.cdptr.javabasics.l5_1;

public class DrobiApp {

    public static void main(String[] args) {

        int k = Drobi.enterNumber("количество дробей в массиве:");

        Drobi[] massivDrobey = new Drobi[k];

        Drobi.initMassive(k, massivDrobey);

        Drobi.putValuesIntoMassive(k, massivDrobey);

        Drobi.printResult(k, massivDrobey);

    }

}

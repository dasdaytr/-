package ZAd24;

public class Main {
    public static void main(String[] args) {
        ComplexFactory complex = new RETComplex();
        Complex complex1 = complex.createDivision();
        complex1.setI(10);
        complex1.setZ(2);
        System.out.print(complex1.Devis());
    }
}

package ZAd24;


public class RETComplex implements ComplexFactory {

    @Override
    public Complex createDivision() {
        return new DivisionComplex();
    }

    @Override
    public Complex createMultiplication() {
        return new MultiplicationComplex();
    }
}

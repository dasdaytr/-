package ZAd24;

public class MultiplicationComplex implements Complex {
    int Z;
    int I;


    public int getZ() {
        return Z;
    }


    public int getI() {
        return I;
    }
    @Override
    public int Multi(){
        return Z*I;
    }

    @Override
    public int Devis() {
        return 0;
    }

    @Override
    public void setZ(int Z) {
        this.Z = Z;
    }

    @Override
    public void setI(int I) {
       this.I= I;
    }
}

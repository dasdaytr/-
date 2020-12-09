package ZAd24;

public class DivisionComplex implements Complex{
    int Z;
    int I;


    public int getZ() {
        return Z;
    }


    public int getI() {
        return I;
    }
    @Override
   public int Devis(){
        return I/Z;
   }


    @Override
    public void setZ(int Z) {
        this.Z = Z;
    }

    @Override
    public void setI(int I) {
        this.I= I;
    }

    @Override
    public int Multi() {
        return 0;
    }
}

package practic5;

public class Square extends Rectangle {

    public Square(double side) {
        super(side,side);
    }
    public Square(double side,String color,boolean filled) {
        super(side,side,color,filled);
    }
    public double getSide() {
        return getLength();
    }
    public void setLength(double side)
    {
        super.setLength(side);
    }
    public void setWith(double side)
    {
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

package practic5;

public class MobablePoint implements Movable {
    double x;
    double y;
    public MobablePoint(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public void Move(double right, double up) {
        x +=right;
        y +=up;

    }
}

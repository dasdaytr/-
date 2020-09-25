package practic5;

public class MovableCircle extends Circle {
    MobablePoint mp;
    public MovableCircle(double radius,String color,boolean filled,double x, double y)
    {
        super(radius, color, filled);
        mp = new MobablePoint(x,y);
    }
    public void SetMp(double x, double y){
        this.mp.setX(x);
        this.mp.setY(y);
    }
    public MobablePoint getMp()
    {
        return mp;
    }
    @Override
    public String toString() {
        return "MovableCircle{" +
                super.toString() +
                ", xCenter=" + mp.getX() +
                ", yCenter=" +  mp.getY() +
                '}';
    }
}

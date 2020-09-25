package practic5;

public class MovableRectangle extends Rectangle {
    MobablePoint mp;
    public MovableRectangle(String color,boolean filled,double width,double lenght,double x, double y){
        super(width,lenght,color,filled);
        mp = new MobablePoint(x,y);
    }
    public void setMp(double x,double y)
    {
        this.mp.setY(y);
        this.mp.setX(x);
    }
     public MobablePoint getMp()
     {
         return mp;
     }
    @Override
    public String toString() {
        return "Rectangle{" +
                super.toString()+
                ", xCenter=" + mp.getX() +
                ", yCenter=" +  mp.getY() +
                '}';
    }
}

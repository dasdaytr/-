package Praktic3;

public class Circle {
    private double radius;
    private String color;
    public Circle(double radius,String color)
    {
        this.color = color;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public String getColor()
    {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getS()
    {
        return (double)Math.PI*radius*radius;
    }
    public double getDiamtr()
    {
        return 2*radius;
    }
    @Override
    public String toString() {
        String a;
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                "S= "+ String.format("%.2f",getS())+ '}';
    }
}

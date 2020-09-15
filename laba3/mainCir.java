package Praktic3;

public class mainCir {
    public static void main(String args[])
    {
        Circle circle = new Circle(14.3,"red");
        System.out.println( String.format("%.2f",circle.getS())+ " " +circle.getDiamtr());
        System.out.println("Изменение радиус и цвета");
        circle.setColor("blue");
        circle.setRadius(20.3);
        System.out.print(circle.toString());

    }
}

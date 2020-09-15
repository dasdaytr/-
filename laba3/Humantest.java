package Praktic3;

public class Humantest {
    public static void main(String args[])
    {
        Human human = new Human(new Head("blue","red"),new Leg(60,41),new Hand(60),"Dan",19,75.3);
        System.out.println("Размер руки  человека "+ human.getHand().getLength());
        System.out.print("Человек вырос и размер его руки стал равен ");
        human.getHand().setLength(67);
        System.out.println(human.getHand().getLength());
        System.out.println("Цвет глаз " + human.getHead().getEarColor() + " Цвет волос "+ human.getHead().getHairColor());
        System.out.print("Имя и возраст "+ human.getName()+" "+ human.getAge());

    }
}

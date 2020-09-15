package Praktic3;

public class Human {
    private Head head;
    private Leg leg;
    private Hand hand;
    private int age;
    private String name;
    private double weight;
    public Human(Head head,Leg leg,Hand hand,String name,int age,double weight)
    {
        this.head = head;
        this.leg = leg;
        this.hand = hand;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public double getWeight()
    {
        return weight;
    }
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
    public Head getHead()
    {
        return head;
    }
    public Leg getLeg()
    {
        return leg;
    }
    public Hand getHand()
    {
        return hand;
    }
    public  void setHead(Head head)
    {
        this.head = head;
    }
    public void setLeg(Leg leg)
    {
        this.leg = leg;
    }
    public void setHand(Head head)
    {
        this.head = head;
    }
}

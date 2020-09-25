package practic7;

public abstract class Furniture {
    private String color;
    private int cost;
    private String name;
    Furniture (String name,String color,int cost)
    {
        this.color = color;
        this.cost = cost;
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void setM(String name, String color, int cost);

    @Override
    public String toString() {
        return "Furniture{" +
                "color='" + color + '\'' +
                ", cost=" + cost +
                ", name='" + name + '\'' +
                '}';
    }
}

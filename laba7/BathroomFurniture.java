package practic7;

public class BathroomFurniture extends Furniture {

    public BathroomFurniture(String name, String color, int cost) {
        super(name,color, cost);

    }

    @Override
    public void setM(String name, String color, int cost) {
        super.setColor(color);
        super.setCost(cost);
        super.setName(name);
    }



}
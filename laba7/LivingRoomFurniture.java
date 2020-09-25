package practic7;

public class LivingRoomFurniture extends Furniture {
    public LivingRoomFurniture(String name, String color, int cost) {
        super(name,color, cost);

    }

    @Override
    public void setM(String name, String color, int cost) {
        super.setColor(color);
        super.setCost(cost);
        super.setName(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

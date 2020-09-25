package practic7;

import java.util.Vector;

public class Person {
    private Vector <Furniture> personVector ;
    public Person(){ personVector = new Vector<>();}
    public void addToCartKitchen(KitchenFurniture kitchenFurniture){

        personVector.addElement(kitchenFurniture);
    }
    public void addToCartBathroom(BathroomFurniture bathroomFurniture){

        personVector.addElement(bathroomFurniture);
    }
    public void addToCartOffice(OfficeFurniture officeFurniture)
    {
        personVector.addElement(officeFurniture);
    }
    public void addToCartLivingRoom(LivingRoomFurniture livingRoomFurniture)
    {
        personVector.addElement(livingRoomFurniture);
    }
    public void displayCart(){
        for(int i = 0; i< personVector.size();i++){
            System.out.println(personVector.get(i).toString());
        }

    }
}

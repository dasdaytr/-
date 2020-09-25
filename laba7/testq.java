package practic7;

public class testq {
    public static void main(String []args) {
    BathroomFurniture bathroomFurniture = new BathroomFurniture("stul","red",25);
    KitchenFurniture kitchenFurniture = new KitchenFurniture("aaa","red",2323);
    OfficeFurniture officeFurniture = new OfficeFurniture("bbb", "red", 232);
    LivingRoomFurniture livingRoomFurniture = new LivingRoomFurniture("bca","red",12312);
    FurnitureShop furnitureShop = new FurnitureShop(bathroomFurniture,kitchenFurniture,livingRoomFurniture,officeFurniture);
    Person person = new Person();
    person.addToCartBathroom(furnitureShop.getBathroomFurniture());
    person.addToCartKitchen(furnitureShop.getKitchenFurniture());
    person.addToCartLivingRoom(furnitureShop.getLivingRoomFurniture());
    person.addToCartOffice(furnitureShop.getOfficeFurniture());
    person.displayCart();

    }
}

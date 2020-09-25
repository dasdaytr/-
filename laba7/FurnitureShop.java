package practic7;

public class FurnitureShop  {
        private BathroomFurniture bathroomFurniture;
        private KitchenFurniture kitchenFurniture;
        private LivingRoomFurniture livingRoomFurniture;
        private OfficeFurniture officeFurniture;
        public FurnitureShop(BathroomFurniture bathroomFurniture){
            this.bathroomFurniture = bathroomFurniture;
        }
        public FurnitureShop(KitchenFurniture kitchenFurniture){
            this.kitchenFurniture = kitchenFurniture;
        }
        public FurnitureShop(LivingRoomFurniture livingRoomFurniture){
            this.livingRoomFurniture = livingRoomFurniture;
        }
        public FurnitureShop(OfficeFurniture officeFurniture){
            this.officeFurniture = officeFurniture;
        }
        public FurnitureShop(BathroomFurniture bathroomFurniture,KitchenFurniture kitchenFurniture,LivingRoomFurniture livingRoomFurniture,OfficeFurniture officeFurniture)
        {
            this.bathroomFurniture = bathroomFurniture;
            this.kitchenFurniture = kitchenFurniture;
            this.livingRoomFurniture = livingRoomFurniture;
            this.officeFurniture = officeFurniture;
        }

    public BathroomFurniture getBathroomFurniture() {
        return bathroomFurniture;
    }

    public KitchenFurniture getKitchenFurniture() {
        return kitchenFurniture;
    }

    public LivingRoomFurniture getLivingRoomFurniture() {
        return livingRoomFurniture;
    }

    public OfficeFurniture getOfficeFurniture() {
        return officeFurniture;
    }


}

package Laba25;

public class Main {
    public static void main(String[] args) {
        ChairFactoty russian = new RussianChair();
        Chair chair1 = russian.createMagic();
        Chair chair2 = russian.createVictorian();
        Chair chair3 = russian.createMultifunctional();
        Client client = new Client();
        client.sit(chair1);
        client.sit(chair2);
        client.sit(chair3);
    }
}

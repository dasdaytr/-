package Laba25;

public class RussianChair implements ChairFactoty {
    @Override
    public Chair createMagic() {
        return new MagicChair();
    }

    @Override
    public Chair createVictorian() {
        return new VictorianChair();
    }

    @Override
    public Chair createMultifunctional() {
        return new MultifunctionalChair();
    }
}

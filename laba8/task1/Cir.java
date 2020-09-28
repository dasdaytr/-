package laba8;

import java.awt.*;

public class Cir extends Shape {


    public Cir(int x, int y, Color color) {
        super(x, y, color);

    }


    public void paintt(Graphics g) {
        g.setColor(getColor());

        g.fillOval(getX(), getY(), 50, 50);

    }
}

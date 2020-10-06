package laba8;

import java.awt.*;

public class Qquare extends Shape {
    public Qquare(int x, int y, Color color) {
        super(x, y, color);

    }


    public void paint(Graphics g) {
        g.setColor(getColor());

        g.fillRect(50, 50, 250, 200);

    }
}

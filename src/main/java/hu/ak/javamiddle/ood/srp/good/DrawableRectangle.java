package hu.ak.javamiddle.ood.srp.good;

import hu.ak.javamiddle.ood.srp.UserInterface;

public class DrawableRectangle {

    private Rectangle rectangle;

    private int x;
    private int y;

    public DrawableRectangle(Rectangle rectangle, int x, int y) {
        this.rectangle = rectangle;
        this.x = x;
        this.y = y;
    }

    public void draw(UserInterface ui) {
        int width = rectangle.getWidth();
        int height = rectangle.getHeight();

        ui.drawLine(x, y, x + width, y);
        ui.drawLine(x, y + height, x + width, y + height);
    }
}

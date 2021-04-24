package hu.ak.javamiddle.ood.srp.bad;

import hu.ak.javamiddle.ood.srp.UserInterface;

public class Rectangle {
    private int width;
    private int height;
    private int x;
    private int y;

    public Rectangle(int width, int height, int x, int y) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void draw(UserInterface ui) {
        ui.drawLine(x, y, x + width, y);
        ui.drawLine(x, y + height, x + width, y + height);
    }

}

package hu.ak.javamiddle.ood.srp.good;

import hu.ak.javamiddle.ood.srp.UserInterface;

public class GoodDemo {

    public static void main(String[] args) {
        UserInterface ui = new UserInterface();

        Rectangle rectangle = new Rectangle(100, 50);

        DrawableRectangle drawableRectangle = new DrawableRectangle(rectangle, 10, 15);

        drawableRectangle.draw(ui);
    }

}

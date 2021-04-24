package hu.ak.javamiddle.ood.srp.bad;

import hu.ak.javamiddle.ood.srp.UserInterface;

public class BadDemo {

    public static void main(String[] args) {
        UserInterface ui = new UserInterface();

        Rectangle rectangle = new Rectangle(100, 160, 50, 100);
        Rectangle rectangle2 = new Rectangle(100, 160, 0, 0);

        rectangle.draw(ui);
    }

}

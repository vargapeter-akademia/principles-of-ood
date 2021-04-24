package hu.ak.javamiddle.ood.demo;

import java.util.Scanner;

public class SwitchCaseOCPDemo {

    enum ShapeType {
        SQUARE, CIRCLE, TRIANGLE, RECTANGLE
    }

    // Rigidity, Fragile, Immobile
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ShapeType type = ShapeType.TRIANGLE;

        Shape shape = new Circle();
        // Rajzoljuk ki a megadott alakzatot
        shape.draw();

        // Számoljuk ki a megadott alakzat területét
        System.out.println(shape.area());

        // Számoljuk ki a megadott alakzat területét
        System.out.println(shape.perimeter());

        System.out.println("Done!");

    }

}

package hu.ak.javamiddle.ood.isp;

public class ShapeClient {

    public void printShape(Shape shape) {
        System.out.println("A=" + shape.area() + " P=" + shape.perimeter());
    }

}

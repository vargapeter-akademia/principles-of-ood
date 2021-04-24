package hu.ak.javamiddle.ood.isp;

public class Rectangle extends DrawableQuadrilateral implements RightShape {

    private final double width;
    private final double height;

    public Rectangle(double width, double height, double x, double y) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public double getLeg1() {
        return width;
    }

    @Override
    public double getLeg2() {
        return height;
    }

}

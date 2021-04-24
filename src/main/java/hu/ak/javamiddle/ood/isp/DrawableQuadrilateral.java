package hu.ak.javamiddle.ood.isp;

public class DrawableQuadrilateral extends Quadrilateral implements DrawableShape {

    private final double x;
    private final double y;

    public DrawableQuadrilateral(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

}

package hu.ak.javamiddle.ood.isp;

public class PythagorasClient {

    public void calculate(RightShape shape) {
        double leg1 = shape.getLeg1();
        double leg2 = shape.getLeg2();
        System.out.println(leg1 + " " + leg2);
    }

}

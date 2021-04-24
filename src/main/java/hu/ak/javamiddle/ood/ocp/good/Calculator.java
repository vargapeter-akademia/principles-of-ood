package hu.ak.javamiddle.ood.ocp.good;

@SuppressWarnings("ALL")
public class Calculator {

    interface Operation {
        int calculate(int x, int y);
    }

    class Addition implements Operation {

        @Override
        public int calculate(int x, int y) {
            return x + y;
        }

    }

    class Substraction implements Operation {

        @Override
        public int calculate(int x, int y) {
            return x - y;
        }

    }


}

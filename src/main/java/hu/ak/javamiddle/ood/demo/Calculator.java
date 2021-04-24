package hu.ak.javamiddle.ood.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

@SuppressWarnings("ConstantConditions")
public class Calculator {

    enum Sign {
        PLUS, MINUS, DIV;
    }

    private static final Map<Sign, BiFunction<Integer, Integer, Integer>> METHODS = new HashMap<>();

    static {
        METHODS.put(Sign.PLUS, (x, y) -> x + y);
        METHODS.put(Sign.MINUS, (x, y) -> x - y);
        METHODS.put(Sign.DIV, (x, y) -> x / y);
    }

    public static void main(String[] args) {

        int x = 0;
        int y = 10;
        Sign sign = Sign.PLUS;

        BiFunction<Integer, Integer, Integer> function = METHODS.get(sign);

        int result = function.apply(x, y);

        System.out.println(result);

    }

}

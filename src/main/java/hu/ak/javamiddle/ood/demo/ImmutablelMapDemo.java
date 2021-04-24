package hu.ak.javamiddle.ood.demo;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

@SuppressWarnings("ConstantConditions")
public class ImmutablelMapDemo {

    public static void main(String[] args) {

        Map<String, String> map = ImmutableMap.of(null, "null");

        System.out.println(map.get(null));
    }

}

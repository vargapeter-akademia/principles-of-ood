package hu.ak.javamiddle.ood.lsp.bad;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ListTest {

    @Test
    public void testList() {
        List<String> list = new ArrayList<>();

        testGeneralBehavior(list);
    }

    @Test
    public void testImmutableList() {
        List<String> list = ImmutableList.of();

        testGeneralBehavior(list);
    }

    public void testGeneralBehavior(List<String> list) {
        list.add("Sample");

        assertTrue(list.contains("Sample"));
    }

}

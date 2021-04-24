package hu.ak.javamiddle.ood.lsp.bad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    public void testRectangle() {
        Rectangle rectangle = new Rectangle();
        testGeneralBehavior(rectangle);
    }

    @Test
    public void testSquare() {
        Rectangle square = new Square();
        testGeneralBehavior(square);
    }

    private void testGeneralBehavior(Rectangle rect) {
        rect.setHeight(5);
        rect.setWidth(4);

        assertEquals(20, rect.getArea());
    }

}
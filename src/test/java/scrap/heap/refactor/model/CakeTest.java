package scrap.heap.refactor.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CakeTest {
    Cake subject;

    @Before
    public void setUp() {
        subject = new Cake.Builder()
                .setFlavor(Cake.Flavor.CHOCOLATE)
                .setFrostingFlavor(Cake.Flavor.VANILLA)
                .setColor(Cake.Color.BROWN)
                .setShape(Cake.Shape.SQUARE)
                .setSize(Cake.Size.LARGE)
                .build();
    }

    @Test
    public void testCakeBuilderCorrectlyBuildsCake() {
        Assert.assertTrue(subject.getFlavor().equals(Cake.Flavor.CHOCOLATE));
        Assert.assertTrue(subject.getFrostingFlavor().equals(Cake.Flavor.VANILLA));
        Assert.assertTrue(subject.getColor().equals(Cake.Color.BROWN));
        Assert.assertTrue(subject.getShape().equals(Cake.Shape.SQUARE));
        Assert.assertTrue(subject.getSize().equals(Cake.Size.LARGE));
    }

    @Test
    public void testItReturnsCorrectOrderData() {
        Assert.assertEquals("cake ordered; chocolate, vanilla, square, large, brown", subject.getOrderData());
    }
}

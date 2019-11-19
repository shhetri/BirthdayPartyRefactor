package scrap.heap.refactor.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import scrap.heap.refactor.constants.Color;
import scrap.heap.refactor.constants.Size;
import scrap.heap.refactor.model.cake.Cake;
import scrap.heap.refactor.model.flavor.Chocolate;
import scrap.heap.refactor.model.flavor.Flavor;
import scrap.heap.refactor.model.flavor.Vanilla;
import scrap.heap.refactor.model.shape.Shape;
import scrap.heap.refactor.model.shape.Square;

public class CakeTest {
    private Cake mSubject;
    private Flavor mChocolate, mVanilla;
    private Shape mSquare;

    @Before
    public void setUp() {
        mChocolate = new Chocolate();
        mVanilla = new Vanilla();
        mSquare = new Square();
        mSubject = new Cake.Builder()
                .setFlavor(mChocolate)
                .setFrostingFlavor(mVanilla)
                .setColor(Color.BROWN)
                .setShape(mSquare)
                .setSize(Size.LARGE)
                .build();
    }

    @Test
    public void testCakeBuilderCorrectlyBuildsCake() {
        Assert.assertTrue(mSubject.getFlavor().getName().equals(mChocolate.getName()));
        Assert.assertTrue(mSubject.getFrostingFlavor().getName().equals(mVanilla.getName()));
        Assert.assertTrue(mSubject.getColor().equals(Color.BROWN));
        Assert.assertTrue(mSubject.getShape().getName().equals(mSquare.getName()));
        Assert.assertTrue(mSubject.getSize().equals(Size.LARGE));
    }

    @Test
    public void testItReturnsCorrectOrderData() {
        Assert.assertEquals("cake ordered; chocolate, vanilla, square, large, brown", mSubject.getOrderData());
    }
}

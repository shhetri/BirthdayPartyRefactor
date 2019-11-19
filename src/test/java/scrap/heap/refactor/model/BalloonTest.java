package scrap.heap.refactor.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import scrap.heap.refactor.constants.Color;
import scrap.heap.refactor.model.balloon.Balloon;
import scrap.heap.refactor.model.material.Latex;
import scrap.heap.refactor.model.material.Material;

public class BalloonTest {
    private Balloon mSubject;
    private Material mLatex;

    @Before
    public void setUp() {
        mLatex = new Latex();
        mSubject = new Balloon.Builder()
                .setColor(Color.BLUE)
                .setMaterial(mLatex)
                .setNumber(5)
                .build();
    }

    @Test
    public void testBalloonBuilderCorrectlyBuildsBalloon() {
        Assert.assertTrue(mSubject.getColor().equals(Color.BLUE));
        Assert.assertTrue(mSubject.getMaterial().getType().equals(mLatex.getType()));
        Assert.assertTrue(mSubject.getNumber() == 5);
    }

    @Test
    public void testItReturnsCorrectOrderData() {
        Assert.assertEquals("Balloons ordered; blue, latex, 5", mSubject.getOrderData());
    }
}

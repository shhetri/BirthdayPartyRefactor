package scrap.heap.refactor.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BalloonTest {
    Balloon subject;

    @Before
    public void setUp() {
        subject = new Balloon.Builder()
                .setColor(Balloon.Color.BLUE)
                .setMaterial(Balloon.Material.LATEX)
                .setNumber(5)
                .build();
    }

    @Test
    public void testBalloonBuilderCorrectlyBuildsBalloon() {
        Assert.assertTrue(subject.getColor().equals(Balloon.Color.BLUE));
        Assert.assertTrue(subject.getMaterial().equals(Balloon.Material.LATEX));
        Assert.assertTrue(subject.getNumber() == 5);
    }

    @Test
    public void testItReturnsCorrectOrderData() {
        Assert.assertEquals("Balloons ordered; blue, latex, 5", subject.getOrderData());
    }
}

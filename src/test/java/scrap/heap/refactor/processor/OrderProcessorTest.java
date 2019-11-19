/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package scrap.heap.refactor.processor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import scrap.heap.refactor.constants.Color;
import scrap.heap.refactor.constants.Size;
import scrap.heap.refactor.dispatcher.IOrderDispatcher;
import scrap.heap.refactor.model.cake.Cake;
import scrap.heap.refactor.model.flavor.Chocolate;
import scrap.heap.refactor.model.flavor.Vanilla;
import scrap.heap.refactor.model.shape.Circle;
import scrap.heap.refactor.order.Order;
import scrap.heap.refactor.order.Orderable;

import java.util.Arrays;

import static org.mockito.Mockito.*;

public class OrderProcessorTest {
    @Mock
    IOrderDispatcher mOrderDispatcher;

    private OrderProcessor mSubject;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        mSubject = new OrderProcessor(mOrderDispatcher);
    }

    @Test
    public void testItProcessOrders() {
        Orderable chocolateCake = new Cake.Builder()
                .setFlavor(new Chocolate())
                .setFrostingFlavor(new Chocolate())
                .setShape(new Circle())
                .setSize(Size.LARGE)
                .setColor(Color.BROWN)
                .build();
        Orderable vanillaCake = new Cake.Builder()
                .setFlavor(new Vanilla())
                .setFrostingFlavor(new Chocolate())
                .setShape(new Circle())
                .setSize(Size.LARGE)
                .setColor(Color.BROWN)
                .build();

        Order order = new Order();
        order.addItems(chocolateCake, vanillaCake);
        mSubject.processOrder(order);

        ArgumentCaptor<Orderable> argumentCaptor = new ArgumentCaptor<>();
        verify(mOrderDispatcher, times(2)).dispatch(argumentCaptor.capture());
        Assert.assertEquals(argumentCaptor.getAllValues(), Arrays.asList(chocolateCake, vanillaCake));
    }
}

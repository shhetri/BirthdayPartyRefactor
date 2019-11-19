package scrap.heap.refactor.dispatcher;


import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import scrap.heap.refactor.order.Orderable;

import static org.mockito.Mockito.verify;

public class OrderDispatcherTest {
    @Mock
    private Orderable mOrderItem;

    private IOrderDispatcher mSubject;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        mSubject = new OrderDispatcher();
    }

    @Test
    public void itShouldDispatchedAnOrderItem() {
        mSubject.dispatch(mOrderItem);
        verify(mOrderItem).getOrderData();
    }
}

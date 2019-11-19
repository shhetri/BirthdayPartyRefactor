package scrap.heap.refactor.dispatcher;

import scrap.heap.refactor.order.Orderable;

public class OrderDispatcher implements IOrderDispatcher {
    @Override
    public void dispatch(Orderable item) {
        System.out.println(item.getOrderData());
    }
}

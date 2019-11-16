package scrap.heap.refactor.processor;

import scrap.heap.refactor.dispatcher.IOrderDispatcher;
import scrap.heap.refactor.model.Orderable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderProcessor {
    private List<Orderable> mOrderableList;
    private IOrderDispatcher mOrderDispatcher;

    public OrderProcessor(IOrderDispatcher orderDispatcher) {
        mOrderableList = new ArrayList<>();
        mOrderDispatcher = orderDispatcher;
    }

    /**
     * Adds item to the processor
     *
     * @param orderableItem Item to order
     */
    public void addItems(Orderable... orderableItem) {
        mOrderableList.addAll(Arrays.asList(orderableItem));
    }

    /**
     * Process the ordered items
     */
    public void processOrder() {
        mOrderableList.forEach(orderable -> {
            mOrderDispatcher.dispatchOrder(orderable.getOrderData());
        });
    }
}

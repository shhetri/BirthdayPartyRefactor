package scrap.heap.refactor.processor;

import scrap.heap.refactor.dispatcher.IOrderDispatcher;
import scrap.heap.refactor.order.Order;

/**
 * Not to over complicate this simple example, I am not making interface and factory for
 * OrderProcessor. In real life scenario, given there was possibility of existence of multiple
 * order processors, I would have created IOrderProcessor and OrderProcessorFactory
 */
public class OrderProcessor {
    private IOrderDispatcher mOrderDispatcher;

    public OrderProcessor(IOrderDispatcher orderDispatcher) {
        mOrderDispatcher = orderDispatcher;
    }

    /**
     * Process the order
     */
    public void processOrder(Order order) {
        order.getItems().forEach(item -> {
            mOrderDispatcher.dispatch(item);
        });
    }
}

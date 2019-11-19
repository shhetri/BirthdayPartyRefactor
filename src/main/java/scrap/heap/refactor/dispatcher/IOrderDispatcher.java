package scrap.heap.refactor.dispatcher;

import scrap.heap.refactor.order.Orderable;

public interface IOrderDispatcher {
    /**
     * Dispatch order of an item
     * @param item Order Item to dispatch
     */
    void dispatch(Orderable item);
}

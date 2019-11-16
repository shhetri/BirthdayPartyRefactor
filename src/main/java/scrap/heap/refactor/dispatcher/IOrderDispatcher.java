package scrap.heap.refactor.dispatcher;

public interface IOrderDispatcher {
    /**
     * Dispatch the order
     * @param orderData The data of the order
     */
    void dispatchOrder(String orderData);
}

package scrap.heap.refactor.dispatcher;

public class OrderDispatcher implements IOrderDispatcher {
    @Override
    public void dispatchOrder(String orderData) {
        System.out.println(orderData);
    }
}

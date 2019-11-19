package scrap.heap.refactor.order;

public abstract class Orderable {
    /**
     * We can remove this method from Orderable and create an IOrderDataProvider and
     * corresponding implementation classes that have a single responsibility
     * of returning the order data. For the simplicity of the exercise I am keeping it here
     *
     * Get the order data
     * @return String
     */
    public abstract String getOrderData();
}

package scrap.heap.refactor.dispatcher;

public class OrderDispatcherFactory {
    /**
     * Returns an implementation of IOrderDispatcher
     * @param type Type of dispatcher
     * @return IOrderDispatcher
     */
    public static IOrderDispatcher getDispatcher(Type type) {
        switch (type) {
            case DEFAULT:
                return new OrderDispatcher();
            default:
                throw new IllegalArgumentException("Unsupported type: " + type);
        }
    }

    public enum Type {
        DEFAULT
    }
}

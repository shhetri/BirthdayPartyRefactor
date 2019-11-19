package scrap.heap.refactor.order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {
    private List<Orderable> mOrderItems;

    public Order() {
        mOrderItems = new ArrayList<>();
    }

    public void addItem(Orderable item) {
        mOrderItems.add(item);
    }

    public void addItems(Orderable... items) {
        mOrderItems.addAll(Arrays.asList(items));
    }

    public List<Orderable> getItems() {
        return mOrderItems;
    }
}

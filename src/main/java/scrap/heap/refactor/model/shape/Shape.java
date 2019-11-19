package scrap.heap.refactor.model.shape;

public abstract class Shape {
    final private String mName;

    Shape(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }
}

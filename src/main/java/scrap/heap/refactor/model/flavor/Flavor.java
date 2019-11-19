package scrap.heap.refactor.model.flavor;

public abstract class Flavor {
    final private String mName;

    Flavor(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }
}

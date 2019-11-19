package scrap.heap.refactor.constants;

/**
 * It can be changed into class to with different sizes being the child of Size class.
 */
public enum Size {
    LARGE("large"), MEDIUM("medium"), SMALL("small");

    private String mSize;

    Size(String size) {
        mSize = size;
    }

    @Override
    public String toString() {
        return mSize;
    }
}

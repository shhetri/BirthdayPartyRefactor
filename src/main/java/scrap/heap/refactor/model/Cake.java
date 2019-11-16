package scrap.heap.refactor.model;

public class Cake extends Orderable {
    private final Flavor mFlavor;
    private final Flavor mFrostingFlavor;
    private final Shape mShape;
    private final Size mSize;
    private final Color mColor;

    /**
     * Making constructor private to force use the builder
     *
     * @param flavor Flavor of cake
     * @param frostingFlavor Frosting flavor of cake
     * @param shape Shape of cake
     * @param size Size of cake
     * @param color color of cake
     */
    private Cake(Flavor flavor, Flavor frostingFlavor, Shape shape, Size size, Color color) {
        mFlavor = flavor;
        mFrostingFlavor = frostingFlavor;
        mShape = shape;
        mSize = size;
        mColor = color;
    }

    public Flavor getFlavor() {
        return mFlavor;
    }

    public Flavor getFrostingFlavor() {
        return mFrostingFlavor;
    }

    public Shape getShape() {
        return mShape;
    }

    public Size getSize() {
        return mSize;
    }

    public Color getColor() {
        return mColor;
    }

    @Override
    public String getOrderData() {
        return "cake ordered; " + mFlavor + ", " + mFrostingFlavor + ", " + mShape + ", " + mSize + ", " + mColor;
    }

    public static class Builder {
        private Flavor mFlavor;
        private Flavor mFrostingFlavor;
        private Shape mShape;
        private Size mSize;
        private Color mColor;

        public Builder setFlavor(Flavor flavor) {
            mFlavor = flavor;
            return this;
        }

        public Builder setFrostingFlavor(Flavor frostingFlavor) {
            mFrostingFlavor = frostingFlavor;
            return this;
        }

        public Builder setShape(Shape shape) {
            mShape = shape;
            return this;
        }

        public Builder setSize(Size size) {
            mSize = size;
            return this;
        }

        public Builder setColor(Color color) {
            mColor = color;
            return this;
        }

        public Cake build() {
            return new Cake(mFlavor, mFrostingFlavor, mShape, mSize, mColor);
        }
    }

    /**
     * Color only applicable to Cake.
     */
    public enum Color {
        BROWN("brown"), YELLOW("yellow");

        private String mName;

        Color(String name) {
            mName = name;
        }

        @Override
        public String toString() {
            return mName;
        }
    }

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

    public enum Shape {
        CIRCLE("circle"), SQUARE("square");

        private String mShape;

        Shape(String shape) {
            mShape = shape;
        }

        @Override
        public String toString() {
            return mShape;
        }
    }

    public enum Flavor {
        VANILLA("vanilla"), CHOCOLATE("chocolate");

        private String mFlavor;

        Flavor(String flavor) {
            mFlavor = flavor;
        }

        @Override
        public String toString() {
            return mFlavor;
        }
    }
}

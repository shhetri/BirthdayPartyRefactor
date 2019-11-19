package scrap.heap.refactor.model.cake;

import scrap.heap.refactor.constants.Color;
import scrap.heap.refactor.constants.Size;
import scrap.heap.refactor.model.flavor.Flavor;
import scrap.heap.refactor.model.shape.Shape;
import scrap.heap.refactor.order.Orderable;

public class Cake extends Orderable {
    private final Flavor mFlavor;
    private final Flavor mFrostingFlavor;
    private final Shape mShape;
    private final Size mSize;
    private final Color mColor;

    /**
     * Making constructor private to force use the builder
     *
     * @param flavor         Flavor of cake
     * @param frostingFlavor Frosting flavor of cake
     * @param shape          Shape of cake
     * @param size           Size of cake
     * @param color          color of cake
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

    /**
     * We can remove this method from Orderable and create an IOrderDataProvider and
     * corresponding implementation classes that have a single responsibility
     * of returning the order data. For the simplicity of the exercise I am keeping it here
     *
     * Get the order data
     * @return String
     */
    @Override
    public String getOrderData() {
        return "cake ordered; " + mFlavor.getName() + ", " + mFrostingFlavor.getName() + ", " + mShape.getName() + ", " + mSize + ", " + mColor;
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

        /**
         * We will have to add validation logic here to check if the provided color is supported
         * by this class or not as we made the Color enum same for Balloon and Cake. For simplicity of this exercise
         * I have not added the validation logic.
         * @param color Color of the Cake
         * @return Builder
         */
        public Builder setColor(Color color) {
            mColor = color;
            return this;
        }

        public Cake build() {
            return new Cake(mFlavor, mFrostingFlavor, mShape, mSize, mColor);
        }
    }
}

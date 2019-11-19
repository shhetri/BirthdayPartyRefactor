package scrap.heap.refactor.model.balloon;

import scrap.heap.refactor.constants.Color;
import scrap.heap.refactor.model.material.Material;
import scrap.heap.refactor.order.Orderable;

public class Balloon extends Orderable {
    final private Color mColor;
    final private Material mMaterial;
    final private int mNumber;

    /**
     * @param color    Color of balloon
     * @param material Material of balloon
     * @param number   Number of balloons
     */
    private Balloon(Color color, Material material, int number) {
        mColor = color;
        mMaterial = material;
        mNumber = number;
    }

    public Color getColor() {
        return mColor;
    }

    public Material getMaterial() {
        return mMaterial;
    }

    public int getNumber() {
        return mNumber;
    }

    /**
     * We can remove this method from Orderable and create an IOrderDataProvider and
     * corresponding implementation classes that have a single responsibility
     * of returning the order data. For the simplicity of the exercise I am keeping it here
     * <p>
     * Get the order data
     *
     * @return String
     */
    @Override
    public String getOrderData() {
        return "Balloons ordered; " + mColor + ", " + mMaterial.getType() + ", " + mNumber;
    }

    public static class Builder {
        private Color mColor;
        private Material mMaterial;
        private int mNumber;

        /**
         * We will have to add validation logic here to check if the provided color is supported
         * by this class or not as we made the Color enum same for Balloon and Cake. For simplicity of this exercise
         * I have not added the validation logic.
         *
         * @param color Color of balloon
         * @return Builder
         */
        public Builder setColor(Color color) {
            mColor = color;
            return this;
        }

        public Builder setMaterial(Material material) {
            mMaterial = material;
            return this;
        }

        public Builder setNumber(int number) {
            mNumber = number;
            return this;
        }

        public Balloon build() {
            return new Balloon(mColor, mMaterial, mNumber);
        }
    }
}

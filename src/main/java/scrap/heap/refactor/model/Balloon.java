package scrap.heap.refactor.model;

public class Balloon extends Orderable {
    final private Color mColor;
    final private Material mMaterial;
    final private int mNumber;

    /**
     * @param color Color of balloon
     * @param material Material of balloon
     * @param number Number of balloons
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

    @Override
    public String getOrderData() {
        return "Balloons ordered; " + mColor + ", " + mMaterial  + ", " + mNumber;
    }

    public static class Builder {
        private Color mColor;
        private Material mMaterial;
        private int mNumber;

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

    /**
     * Color only applicable to Balloon.
     */
    public enum Color {
        RED("red"), BLUE("blue"), YELLOW("yellow");

        private String mColor;

        Color(String color) {
            mColor = color;
        }

        @Override
        public String toString() {
            return mColor;
        }
    }

    public enum Material {
        LATEX("latex"), MYLAR("mylar");

        private String mMaterial;

        Material(String material) {
            mMaterial = material;
        }

        @Override
        public String toString() {
            return mMaterial;
        }
    }
}

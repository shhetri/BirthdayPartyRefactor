package scrap.heap.refactor.model.material;

public abstract class Material {
    final private String mType;

    public String getType() {
        return mType;
    }

    Material(String type) {
        mType = type;
    }
}

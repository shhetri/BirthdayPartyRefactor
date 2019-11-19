package scrap.heap.refactor.constants;

/**
 * Initially I assumed different color enums for Cake and Balloon so that we can explicitly
 * define which color we want and would not have to worry about whether a chosen color is available
 * for Cake or Balloon
 * With this implementation, we kinda remove the redundant Color enum, but now, we have to add validation in
 * each class to check if the provided color is supported/available or not.
 */
public enum Color {
    RED("red"), BLUE("blue"), YELLOW("yellow"), BROWN("brown");

    private String mName;

    Color(String name) {
        mName = name;
    }

    @Override
    public String toString() {
        return mName;
    }
}

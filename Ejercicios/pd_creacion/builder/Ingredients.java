package builder;

public enum Ingredients {

    PEPPERONI, SALAMI, HAM, MUSHROOMS, PINEAPPLE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}


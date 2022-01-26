package builder;

public enum Dough {

    CROSS, PANBAKED;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
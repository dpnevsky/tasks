package design_patterns.factory;

public abstract class Coffee {

    public abstract void prepare();

    @Override
    public String toString() {

        return this.getClass().getSimpleName();
    }
}

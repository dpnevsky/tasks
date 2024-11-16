package design_patterns.factory;

public class Espresso extends Coffee {
    @Override
    public void prepare() {

        System.out.println("Preparing Espresso.");
    }
}

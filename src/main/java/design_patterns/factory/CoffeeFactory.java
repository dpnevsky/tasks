package design_patterns.factory;

//Создать класс кофе, от него наследовать два вида кофе, в зависимости от того какой тип кофе мы хотим,
// создавать именно его через фабрику. (espresso, americano)
public class CoffeeFactory {
    public static Coffee createCoffee(CoffeeType coffeeType) {
        if (coffeeType == null) {
            throw new IllegalArgumentException("Coffee type must not be null or empty");
        }
        return switch (coffeeType) {
            case ESPRESSO -> new Espresso();
            case AMERICANO -> new Americano();
        };
    }
}

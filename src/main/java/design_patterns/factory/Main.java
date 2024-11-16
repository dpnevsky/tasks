package design_patterns.factory;

public class Main {
    public static void main(String[] args) {

        Coffee espresso = CoffeeFactory.createCoffee(CoffeeType.ESPRESSO);
        Coffee americano = CoffeeFactory.createCoffee(CoffeeType.AMERICANO);

        System.out.println("Make: " + espresso);
        espresso.prepare();

        System.out.println("Make: " + americano);
        americano.prepare();
    }
}

/*result:

Make: Espresso
Preparing Espresso.
Make: Americano
Preparing Americano.

 */

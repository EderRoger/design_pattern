package factory;

/**
 * Created by eder on 08/10/15.
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chigado deep cheese pizza";
        dough = "Extra trick crust Dough";
        sauce = "Plum tomato sauce";
        toppings.add("Sheered mussarela Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cut the pizza in the square slices");
    }
}

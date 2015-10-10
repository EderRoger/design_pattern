package factory;

/**
 * Created by eder on 08/10/15.
 */
public class ChicagoStyleCheesePizza extends Pizza {
    PizzaIgredientFactory pizzaIgredientFactory;

    public ChicagoStyleCheesePizza(PizzaIgredientFactory pizzaIgredientFactory) {
        this.pizzaIgredientFactory = pizzaIgredientFactory;
        name = "Chigado deep cheese pizza";
        toppings.add("Sheered mussarela Cheese");
    }

    @Override
    void prepare() {
        dough = pizzaIgredientFactory.createDough();
        sauce = pizzaIgredientFactory.createSauce();
    }

    @Override
    public void cut() {
        System.out.println("Cut the pizza in the square slices");
    }
}

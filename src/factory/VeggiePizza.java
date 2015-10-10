package factory;

/**
 * Created by eder on 08/10/15.
 */
public class VeggiePizza extends Pizza {

    PizzaIgredientFactory pizzaIgredientFactory;

    public VeggiePizza(PizzaIgredientFactory pizzaIgredientFactory) {
        this.pizzaIgredientFactory = pizzaIgredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIgredientFactory.createDough();
        sauce = pizzaIgredientFactory.createSauce();
        cheese = pizzaIgredientFactory.createCheese();

    }
}

package factory;

/**
 * Created by eder on 08/10/15.
 */
public class CheesePizza extends Pizza {
    PizzaIgredientFactory pizzaIgredientFactory;

    public CheesePizza(PizzaIgredientFactory pizzaIgredientFactory) {
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

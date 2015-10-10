package factory;

/**
 * Created by eder on 08/10/15.
 */
public class NYStyleClamPizza extends Pizza {
    PizzaIgredientFactory pizzaIgredientFactory;

    public NYStyleClamPizza(PizzaIgredientFactory pizzaIgredientFactory) {
        this.pizzaIgredientFactory = pizzaIgredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIgredientFactory.createDough();
        sauce = pizzaIgredientFactory.createSauce();
        cheese = pizzaIgredientFactory.createCheese();
        clam = pizzaIgredientFactory.createClam();
    }
}

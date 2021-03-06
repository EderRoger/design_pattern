package factory;

/**
 * Created by eder on 08/10/15.
 */
public class NYStylePepperoniPizza extends Pizza {
    PizzaIgredientFactory pizzaIgredientFactory;

    public NYStylePepperoniPizza(PizzaIgredientFactory pizzaIgredientFactory) {
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

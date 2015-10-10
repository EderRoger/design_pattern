package factory;

/**
 * Created by eder on 09/10/15.
 */
public class ClamPizza extends Pizza {

    PizzaIgredientFactory pizzaIgredientFactory;

    public ClamPizza(PizzaIgredientFactory pizzaIgredientFactory) {
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

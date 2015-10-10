package factory;

/**
 * Created by eder on 09/10/15.
 */
public interface PizzaIgredientFactory {
    Dough createDough();
    Sauce createSouce();
    Cheese createCheese();
    Vegies[] createVegies();
    Pepperoni createPepperoni();
    Clam createClam();
}

package factory;

/**
 * Created by eder on 09/10/15.
 */
public interface PizzaIgredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVegies();
    Pepperoni createPepperoni();
    Clam createClam();
}

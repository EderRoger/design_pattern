package factory;

/**
 * Created by eder on 09/10/15.
 */
public class NYPizzaIgredientFactory implements PizzaIgredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVegies() {
        Veggies vegies[] = {new Gralic(), new Onion(), new Mushuroom(), new RedPepper()};
        return  vegies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicePepperoni();
    }

    @Override
    public Clam createClam() {
        return new FreshClam();
    }
}

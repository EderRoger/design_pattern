package factory;

/**
 * Created by eder on 08/10/15.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }
        return null;
    }
}
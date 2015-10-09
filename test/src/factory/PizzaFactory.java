package factory;

import org.junit.Test;

/**
 * Created by eder on 08/10/15.
 */
public class PizzaFactory {
    @Test
    public void testPizzaStore(){
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chigagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chigagoPizzaStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}

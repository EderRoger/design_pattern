package factory;

/**
 * Created by eder on 13/10/15.
 */
public class CaliforniPizzaStore extends PizzaStore {
    Pizza pizza = null;
    PizzaIgredientFactory pizzaIgredientFactory = new CaliforniaPizzaIgredientFactory();

    @Override
    Pizza createPizza(String type) {
        if(type.equals("cheese")){
            pizza = new CheesePizza(pizzaIgredientFactory);
            pizza.setName("Cheese pizza NY style");
        }else if(type.equals("veggie")){
            pizza = new VeggiePizza(pizzaIgredientFactory);
            pizza.setName("Veggie pizza NY Style");
        }else if(type.equals("clam")){
            pizza = new ClamPizza(pizzaIgredientFactory);
            pizza.setName("Clam Pizza NY Style");
        }else if(type.equals("pepperoni")){
            pizza = new PepperoniPizza(pizzaIgredientFactory);
            pizza.setName("Pepperoni Pizza NY Style");
        }
        return pizza;
    }
}

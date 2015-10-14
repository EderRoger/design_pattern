package factory;

/**
 * Created by eder on 13/10/15.
 */
public class CaliforniPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new CaliforniaStyleCheesePizza();
        }else if(type.equals("veggie")){
            return new CaliforniaStyleVeggiePizza();
        }else if(type.equals("clam")){
            return new CaliforniaStyleClamPizza();
        }else if(type.equals("pepperoni")){
            return new CaliforniaStylePepperoniPizza();
        }
        return null;
    }
}

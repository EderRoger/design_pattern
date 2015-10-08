package factory;

/**
 * Created by eder on 08/10/15.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {

        if(type.equals("cheese")){
            return new NYStyleCheesePizza();
        }else if(type.equals("veggie")){
            return new NYStyleVeggiePizza();
        }else if(type.equals("clam")){
            return new NYStyleClamPizza();
        }else if(type.equals("pepperoni")){
            return new NYStylePepperoniPizza();
        }
        return null;
    }
}

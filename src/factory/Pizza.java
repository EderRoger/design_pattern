package factory;

import java.util.ArrayList;

/**
 * Created by eder on 07/10/15.
 */
public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clam clam;
    ArrayList toppings = new ArrayList();

    abstract void prepare();

//    public void prepare() {
//        System.out.println("Preparing " + name);
//        System.out.println("Tossing dough");
//        System.out.println("Adding sauce");
//        System.out.println("Adding toppings: ");
//        for (int i = 0; i < toppings.size(); i++) {
//            System.out.println("  " + toppings.get(i));
//        }
//    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza in the diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in oficial PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

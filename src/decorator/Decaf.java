package decorator;

/**
 * Created by eder on 04/10/15.
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf";
    }

    @Override
    double cost() {
        return 1.05;
    }
}

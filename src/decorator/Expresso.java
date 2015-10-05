package decorator;

/**
 * Created by eder on 04/10/15.
 */
public class Expresso extends Beverage {

    public Expresso() {
        description = "Expresso";
    }

    @Override
    double cost() {
        return 1.99;
    }
}

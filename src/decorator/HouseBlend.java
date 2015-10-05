package decorator;

/**
 * Created by eder on 04/10/15.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffe";
    }

    @Override
    double cost() {
        return .89;
    }
}

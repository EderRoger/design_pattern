package decorator;

/**
 * Created by eder on 05/10/15.
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    double cost() {
        return .20 + beverage.cost();
    }
}

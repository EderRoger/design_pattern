package decorator;

/**
 * Created by eder on 05/10/15.
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    String getDescripton() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    double cost() {
        return .40 + beverage.cost();
    }
}

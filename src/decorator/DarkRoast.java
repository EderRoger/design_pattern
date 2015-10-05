package decorator;

/**
 * Created by eder on 04/10/15.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    double cost() {
        return .89;
    }
}

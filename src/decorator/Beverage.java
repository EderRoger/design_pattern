package decorator;

/**
 * Created by eder on 04/10/15.
 */
public abstract class Beverage {
    String description = "Unknow benerage";

    public String getDescription() {
        return description;
    }

    abstract double cost();
}

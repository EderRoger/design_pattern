package strategy;

/**
 * Created by eder on 30/09/15.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}

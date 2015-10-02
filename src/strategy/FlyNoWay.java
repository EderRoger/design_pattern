package strategy;

/**
 * Created by eder on 30/09/15.
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I cant fly");
    }
}

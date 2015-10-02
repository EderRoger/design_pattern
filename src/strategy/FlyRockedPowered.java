package strategy;

/**
 * Created by eder on 30/09/15.
 */
public class FlyRockedPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm a fly with a rocket");
    }
}

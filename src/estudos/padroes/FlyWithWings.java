package estudos.padroes;

/**
 * Created by eder on 30/09/15.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}

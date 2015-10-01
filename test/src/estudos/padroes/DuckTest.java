package estudos.padroes;

import org.junit.Test;

/**
 * Created by eder on 30/09/15.
 */
public class DuckTest {

    @Test
    public void simulator(){
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        // dinamic behavior
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRockedPowered());
        model.performFly();
    }
}

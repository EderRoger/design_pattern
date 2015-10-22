package adapter;

import org.junit.Test;

/**
 * Created by eder on 22/10/15.
 */
public class DuckAdapterTest {
    @Test
    public void testDuckAdapter(){
        Mallarduck duck = new Mallarduck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turk says....");
        turkey.gooble();
        turkey.fly();

        System.out.println("\n the Duck says .....");
        testDuck(duck);

        System.out.println("\n The turk adapater says...");
        testDuck(turkeyAdapter);

    }

    private void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}

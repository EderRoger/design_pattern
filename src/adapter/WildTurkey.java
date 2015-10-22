package adapter;

/**
 * Created by eder on 22/10/15.
 */
public class WildTurkey implements Turkey {
    @Override
    public void gooble() {
        System.out.println("globlie globie");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}

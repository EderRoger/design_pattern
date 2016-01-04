package adapter;

import strategy.*;

/**
 * Created by eder on 22/10/15.
 */
public class Mallarduck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
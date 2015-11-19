package state;

/**
 * Created by eder on 19/11/15.
 */
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}

package state.proxy;

import org.junit.Test;
import state.GumballMachine;

/**
 * Created by eder on 24/11/15.
 */
public class GumballMonitorTest {

    @Test public void testMonitor(){
        int count = 10;

        GumballMachine machine = new GumballMachine(count, "To the mall");
        GumballMonitor monitor = new GumballMonitor(machine);

        machine.insertQuarter();
        machine.turnCrank();
        machine.ejectQuarter();

        monitor.report();
    }
}

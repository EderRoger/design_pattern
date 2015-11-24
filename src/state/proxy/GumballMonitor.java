package state.proxy;

import state.GumballMachine;

/**
 * Created by eder on 24/11/15.
 */
public class GumballMonitor {

    GumballMachine machine;

    public GumballMonitor(GumballMachine machine) {
        this.machine = machine;
    }

    public void report(){
        System.out.println("Gumball machine: " + machine.getLocation());
        System.out.println("Current iventory: " + machine.getCount() + " gumballs");
        System.out.println("Current state: " + machine.getState());
    }
}

package state;

/**
 * Created by eder on 16/11/15.
 */
public class GumballMachine {

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;
    State state = soldOutState;
    int count = 0;
    String location;

    public GumballMachine(int numberOfGumballs, String location) {
        this.location = location;
        configure(numberOfGumballs);
    }

    public GumballMachine(int numberOfGumballs) {
        configure(numberOfGumballs);
    }

    private void configure(int numberOfGumballs){
        soldState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldOutState = new SoldOutState(this);
        this.count = numberOfGumballs;

        if (numberOfGumballs > 0) {
            state = noQuarterState;
        }

    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state){
        this.state = state;
    }

    public void releaseBall(){
        System.out.println("A gumball comes rolling out the slot...");
        if(count != 0){
            count--;
        }
    }
    @Override
    public String toString() {
        return "Gumball .INC";
    }

    public String getLocation() {
        return location;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public int getCount(){
        return count;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getState() {
        return state;
    }
}

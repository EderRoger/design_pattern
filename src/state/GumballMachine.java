package state;

/**
 * Created by eder on 16/11/15.
 */
public class GumballMachine {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("You can't insert another quarter");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("You inserted a quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("You can't insert a quarter, the machine is sold out");
        } else if (state == SOLD) {
            System.out.println("Please wait, we're already giving a gumball");
        }
    }

    public void ejectQuarter() {

        if (state == HAS_QUARTER) {
            System.out.println("Quarter returned");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("You haven't inserted a quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("You can't reject, you haven't inserted a quarter yet");
        } else if (state == SOLD) {
            System.out.println("Sorry, you already turne the crank");
        }
    }

    public void turnCrank() {

        if (state == SOLD) {
            System.out.println("Turnig twice doesn't get to another gumball");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("You turned but there's no quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("You turned but there's no gumballs");
        } else if (state == HAS_QUARTER) {
            System.out.println("You turned...");
            state = SOLD;
            dispense();
        }
    }

    public void dispense(){
        if(state == SOLD){
            System.out.println("A gumball comming roling out to slot");
            count--;
            if(count == 0){
                System.out.println("Oops, out of gumballs");
                state = SOLD_OUT;
            }else{
                state = NO_QUARTER;
            }
        }else if(state == NO_QUARTER){
            System.out.println("You need to pay first");
        }else if(state == SOLD_OUT){
            System.out.println("No gumballs dispensed");
        }else if(state == HAS_QUARTER){
            System.out.println("No gumballs dispensed");
        }
    }

    @Override
    public String toString() {
        return "Gumball .INC";
    }
}
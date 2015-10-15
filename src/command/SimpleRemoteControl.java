package command;

/**
 * Created by eder on 15/10/15.
 */
public class SimpleRemoteControl {
    Command slot;

    public void setSlot(Command slot) {
        this.slot = slot;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}

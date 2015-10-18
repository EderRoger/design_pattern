package command;

import org.junit.Test;

/**
 * Created by eder on 15/10/15.
 */
public class GarageDoorTest {

    @Test
    public void testOpenGarage(){
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("Garage");
        GarageDoor garageDoor = new GarageDoor(light);
        LightOnCommand lightCommand = new LightOnCommand(light);
        GarageDoorUpCommand garageDoorOpenCommand = new GarageDoorUpCommand(garageDoor);
        remote.setSlot(lightCommand);
        remote.buttonWasPressed();
        remote.setSlot(garageDoorOpenCommand);
        remote.buttonWasPressed();
    }
}

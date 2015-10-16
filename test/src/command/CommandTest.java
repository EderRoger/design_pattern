package command;

import org.junit.Test;

/**
 * Created by eder on 15/10/15.
 */
public class CommandTest {
    @Test
    public void testCommandExecute(){
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightCommand lightCommand = new LightCommand(light);
        simpleRemoteControl.setSlot(lightCommand);
        simpleRemoteControl.buttonWasPressed();
    }
}

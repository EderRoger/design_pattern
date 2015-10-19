package command;

import org.junit.Test;

/**
 * Created by eder on 17/10/15.
 */
public class RemoteUndoTest {

    @Test
    public void testRemoteUndo(){
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
        System.out.println(remoteControl);
    }

}

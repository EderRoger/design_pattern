package command;

import org.junit.Test;

import java.rmi.Remote;

/**
 * Created by eder on 20/10/15.
 */
public class MacroCommandTest {
    @Test
    public void testMacroCommands(){

        Light light = new Light("Living Room");
        Stereo stereo = new Stereo("Livin Room");

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);

        LightOffCommand lightOffCommand = new LightOffCommand(light);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        Command[] partyOn = {lightOnCommand, stereoOnWithCDCommand};
        Command[] partyOff = { lightOffCommand, stereoOffCommand};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);

    }
}

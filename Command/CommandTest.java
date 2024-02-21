package Command;

import Command.Command.*;
import Command.Receiver.*;

public class CommandTest {
    public static void main(String[] argv) {
        Light light = new Light();
        Stereo stereo = new Stereo();

        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);
        Command stereoSetHighCommand = new StereoSetHighCommand(stereo);
        Command stereoSetMediumCommand = new StereoSetMediumCommand(stereo);
        Command stereoSetLowCommand = new StereoSetLowCommand(stereo);
        Command stereoOffCommand = new StereoOffCommand(stereo);
        
        RemoteControl remoteControl = new RemoteControl(4);
        remoteControl.setCommand(2, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(3, stereoSetHighCommand, stereoSetMediumCommand);
        remoteControl.setCommand(4, stereoSetLowCommand, stereoOffCommand);

        remoteControl.onCommandPushed(1);
        remoteControl.undoCommandPushed();
        remoteControl.offCommandPushed(1);
        remoteControl.undoCommandPushed();

        remoteControl.onCommandPushed(2);
        remoteControl.undoCommandPushed();
        remoteControl.offCommandPushed(2);
        remoteControl.undoCommandPushed();

        remoteControl.onCommandPushed(3);
        remoteControl.offCommandPushed(3);
        remoteControl.undoCommandPushed();

        remoteControl.onCommandPushed(4);
        remoteControl.offCommandPushed(4);
        remoteControl.undoCommandPushed();
    }
}

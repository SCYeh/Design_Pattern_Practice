package Command;

import java.util.ArrayList;
import java.util.List;
import Command.Command.*;

public class RemoteControl {
    private List<Command> onCommands;
    private List<Command> offCommands;
    private Command undoCommand;

    public RemoteControl(int buttonMax) {
        onCommands = new ArrayList<>();
        offCommands = new ArrayList<>();
        undoCommand = new NoCommand();

        for (int i = 1; i <= buttonMax ; i++) {
            onCommands.add(new NoCommand());
            offCommands.add(new NoCommand());
        }
    }

    public void setCommand(int idx, Command onCommand, Command offCommand) {
        onCommands.set(idx-1, onCommand);
        offCommands.set(idx-1, offCommand);
    }

    public void onCommandPushed(int idx) {
        onCommands.get(idx-1).execute();
        undoCommand = onCommands.get(idx-1);
    }

    public void offCommandPushed(int idx) {
        offCommands.get(idx-1).execute();
        undoCommand = offCommands.get(idx-1);
    }

    public void undoCommandPushed() {
        undoCommand.undo();
    }
}

package Command.Command;

public class NoCommand implements Command {
    public void execute() {
        System.out.println("Nothing happened!");
    }

    public void undo() {
        System.out.println("Nothing happened!");
    }
}

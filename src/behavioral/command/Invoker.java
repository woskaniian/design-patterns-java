package behavioral.command;

public class Invoker {
    Command command;

    public void setCommand(behavioral.command.Command command) {
        this.command = command;
    }

    public void invoke() {
        this.command.execute();
    }
}

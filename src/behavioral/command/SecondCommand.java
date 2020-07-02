package behavioral.command;

public class SecondCommand implements Command {
    SecondReceiver receiver;

    public SecondCommand(SecondReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("Executing Second type command");
        this.receiver.doAnotherWork();
    }
}

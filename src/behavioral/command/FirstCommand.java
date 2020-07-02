package behavioral.command;

public class FirstCommand implements Command {
    FirstReceiver receiver;

    public FirstCommand(FirstReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("Executing First type command");
        this.receiver.doSomeWork();
    }
}

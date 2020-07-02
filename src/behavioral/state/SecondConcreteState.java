package behavioral.state;

public class SecondConcreteState implements State {
    @Override
    public void doSomeWork(Context context) {
        System.out.println("Doing some work based on second state");
    }
}

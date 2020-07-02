package behavioral.state;

public class FirstConcreteState implements State {
    @Override
    public void doSomeWork(Context context) {
        System.out.println("Doing some work based on first state");
    }
}

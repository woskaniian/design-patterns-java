package behavioral.state;

public class Context {
    State state;

    public Context(behavioral.state.State state) {
        this.state = state;
    }

    public void setState(behavioral.state.State state) {
        this.state = state;
    }

    public void doSomeStateDependentWork() {
        this.state.doSomeWork(this);
    }
}

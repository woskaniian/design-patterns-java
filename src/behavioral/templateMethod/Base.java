package behavioral.templateMethod;

public abstract class Base {
    public final void templateAlgorithm() {
        firstStep();
        secondStep();
        thirdStep();
        forthStep();
    }

    protected abstract void firstStep();

    protected abstract void secondStep();

    protected void thirdStep() {
        System.out.println("Default implementation of third step");
    }

    protected final void forthStep() {
        System.out.println("Fifth step with final implementation");
    }
}

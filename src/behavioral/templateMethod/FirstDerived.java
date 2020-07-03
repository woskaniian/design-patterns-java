package behavioral.templateMethod;

public class FirstDerived extends Base{
    @Override
    public void firstStep() {
        System.out.println("First step overriden in First derived ");
    }

    @Override
    public void secondStep() {
        System.out.println("Second step overriden in First derived ");

    }
}

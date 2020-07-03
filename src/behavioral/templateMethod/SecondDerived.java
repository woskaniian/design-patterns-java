package behavioral.templateMethod;

public class SecondDerived extends Base {
    @Override
    public void firstStep() {
        System.out.println("First step overriden in Second derived ");
    }

    @Override
    public void secondStep() {
        System.out.println("Second step overriden in Second derived ");
    }

    @Override
    public void thirdStep() {
        System.out.println("Third step overriden in Second derived ");
    }
}

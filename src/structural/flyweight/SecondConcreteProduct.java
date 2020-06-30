package structural.flyweight;

public class SecondConcreteProduct extends AbstractProduct {
    public SecondConcreteProduct() {
        System.out.println("Constructing second concrete product");
    }
    @Override
    public void doSomething() {
        System.out.println("Doing some work in second concrete product");
    }
}

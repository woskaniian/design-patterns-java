package structural.flyweight;

public class FirstConcreteProduct extends AbstractProduct {
    public FirstConcreteProduct() {
        System.out.println("Constructing first concrete product");
    }

    @Override
    public void doSomething() {
        System.out.println("Doing some work in first concrete product");
    }
}

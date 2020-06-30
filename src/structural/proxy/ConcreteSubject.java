package structural.proxy;

public class ConcreteSubject implements Subject {
    @Override
    public void doSomething() {
        System.out.println("Doing work in concrete subject");
    }
}

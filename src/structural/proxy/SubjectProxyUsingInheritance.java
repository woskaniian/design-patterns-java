package structural.proxy;

public class SubjectProxyUsingInheritance extends ConcreteSubject {
    @Override
    public void doSomething() {
        System.out.println("Making decisions, doing some work in inherited proxy and then calling real subject");
        super.doSomething();
    }
}

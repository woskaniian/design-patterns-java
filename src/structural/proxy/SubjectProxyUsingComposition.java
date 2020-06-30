package structural.proxy;

public class SubjectProxyUsingComposition implements Subject {
    private ConcreteSubject subject;

    public SubjectProxyUsingComposition() {
        subject = new ConcreteSubject();
    }

    public void doSomething() {
        System.out.println("Making decisions, doing some work in composite proxy and then calling real subject");
        subject.doSomething();
    }
}

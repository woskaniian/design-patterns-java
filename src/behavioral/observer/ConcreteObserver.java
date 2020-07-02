package behavioral.observer;

public class ConcreteObserver implements Observer {
    @Override
    public void notify(Object update) {
        System.out.println("Notified about change :: " + update);
    }
}

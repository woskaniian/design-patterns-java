package behavioral.observer;

public class ConcreteObservable implements Observable {

    private String field1;
    private String field2;
    private String field3;

    private boolean changed;
    private java.util.ArrayList<Observer> observers;

    public ConcreteObservable() {
        this.observers = new java.util.ArrayList<>();
        this.changed = false;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
        this.changed = true;
        this.notifyObservers(this.toString());
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
        this.changed = true;
        this.notifyObservers(this.toString());
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
        this.changed = true;
        this.notifyObservers(this.toString());
    }

    public synchronized void subscribe(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void notifyObservers(Object update) {
        if (!changed) {
            return;
        }
        for (behavioral.observer.Observer obs : this.observers) {
            obs.notify(update);
        }
        changed = false;
    }

    @Override
    public String toString() {
        return "ConcreteObservable{" +
                "field1='" + field1 + '\'' +
                ", field2='" + field2 + '\'' +
                ", field3='" + field3 + '\'' +
                '}';
    }
}

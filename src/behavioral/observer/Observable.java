package behavioral.observer;

// Subject
public interface Observable {
    void notifyObservers(Object update);

    void subscribe(Observer observer);
}

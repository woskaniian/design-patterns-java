package behavioral.memento;

public class Caretaker {
    private Memento memento;

    public void undo(Originator originator) {
        originator.restoreMemento(memento);
    }

    public void save(Originator originator) {
        memento = originator.createMemento();
    }
}

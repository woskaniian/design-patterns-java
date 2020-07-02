package behavioral.iterator;

public class ConcreteCollection<E> implements Collection<E> {

    java.util.ArrayList<E> elements;

    public ConcreteCollection() {
        elements = new java.util.ArrayList<>();
    }

    public void add(E element) {
        this.elements.add(element);
    }

    public void remove(E element) {
        this.elements.remove(element);
    }

    @Override
    public String toString() {
        return this.elements.toString();
    }

    @Override
    public behavioral.iterator.Iterator<E> iterator() {
        return new behavioral.iterator.ConcreteCollection<E>.ConcreteIterator();
    }

    private class ConcreteIterator implements Iterator<E> {

        int cursor;

        @Override
        public E next() {
            return elements.get(cursor++);
        }

        @Override
        public boolean hasNext() {
            return cursor != elements.size();
        }
    }
}

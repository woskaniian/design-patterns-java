package behavioral.iterator;

public interface Collection<E> {
    Iterator<E> iterator();

    void add(E element);

    void remove(E element);
}

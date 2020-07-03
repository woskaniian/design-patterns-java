package behavioral.visitor;

public interface Visitable {
    void accept(RouterVisitor visitor);
}

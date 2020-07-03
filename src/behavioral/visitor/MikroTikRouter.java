package behavioral.visitor;

public class MikroTikRouter extends Router {
    @Override
    public void accept(RouterVisitor visitor) {
        visitor.visit(this);
    }
}

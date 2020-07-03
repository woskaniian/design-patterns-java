package behavioral.visitor;

public class TpLinkRouter extends Router {
    @Override
    public void accept(RouterVisitor visitor) {
        visitor.visit(this);
    }
}

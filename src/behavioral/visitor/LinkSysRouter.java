package behavioral.visitor;

public class LinkSysRouter  extends Router{
    @Override
    public void accept(RouterVisitor visitor) {
        visitor.visit(this);
    }
}

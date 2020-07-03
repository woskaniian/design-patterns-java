package behavioral.visitor;

public abstract class RouterVisitor {
    public abstract void visit(MikroTikRouter router);

    public abstract void visit(TpLinkRouter router);

    public abstract void visit(LinkSysRouter router);

}

package behavioral.visitor;

public class MacConfigurator extends RouterVisitor{
    @Override
    public void visit(MikroTikRouter router) {
        System.out.println("Configured MikroTik router for mac");
    }

    @Override
    public void visit(TpLinkRouter router) {
        System.out.println("Configured TpLink router for mac");
    }

    @Override
    public void visit(LinkSysRouter router) {
        System.out.println("Configured LinkSys router for mac");
    }
}

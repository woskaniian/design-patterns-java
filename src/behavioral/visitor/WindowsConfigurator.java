package behavioral.visitor;

public class WindowsConfigurator extends RouterVisitor {
    @Override
    public void visit(MikroTikRouter router) {
        System.out.println("Configured MikroTik router for windows");
    }

    @Override
    public void visit(TpLinkRouter router) {
        System.out.println("Configured TpLink router for windows");
    }

    @Override
    public void visit(LinkSysRouter router) {
        System.out.println("Configured LinkSys router for windows");
    }
}

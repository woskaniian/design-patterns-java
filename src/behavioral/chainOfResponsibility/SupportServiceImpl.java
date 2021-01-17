package behavioral.chainOfResponsibility;

public class SupportServiceImpl extends SupportService {

    private SupportService handler = null;

    public SupportService getHandler() {
        return handler;
    }

    public void setHandler(SupportService handler) {
        this.handler = handler;
    }

    @Override
    public void handleRequest(ServiceRequest request) {
        handler.handleRequest(request);
    }
}
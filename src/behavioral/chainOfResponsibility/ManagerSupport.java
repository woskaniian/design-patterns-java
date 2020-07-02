package behavioral.chainOfResponsibility;

public class ManagerSupport implements SupportService {

    private SupportService next = null;

    public SupportService getNext() {
        return next;
    }

    public void setNext(SupportService next) {
        this.next = next;
    }

    @Override
    public void handleRequest(ServiceRequest request) {
        if (request.getType() == ServiceLevel.LEVEL_THREE) {
            request.setConclusion("Manager solved level three request !!");
        } else {
            if (next != null) {
                next.handleRequest(request);
            } else {
                throw new IllegalArgumentException("No handler found for :: " + request.getType());
            }
        }
    }
}
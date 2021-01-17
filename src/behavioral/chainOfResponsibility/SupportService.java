package behavioral.chainOfResponsibility;

public abstract class SupportService {
    protected SupportService next = null;

    public abstract void handleRequest(ServiceRequest request);

    public SupportService getNext() {
        return next;
    }

    public void setNext(SupportService next) {
        this.next = next;
    }

}

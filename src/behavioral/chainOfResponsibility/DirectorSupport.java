package behavioral.chainOfResponsibility;

public class DirectorSupport implements SupportService {

    private SupportService next = null;

    public SupportService getNext() {
        return next;
    }

    public void setNext(SupportService next) {
        this.next = next;
    }

    @Override
    public void handleRequest(ServiceRequest request) {
        if (request.getType() == ServiceLevel.LEVEL_FOUR) {
            request.setConclusion("Director solved level four request !!");
        } else {
            if (next != null) {
                next.handleRequest(request);
            } else {
                request.setConclusion("You problem is none of our business");
                throw new IllegalArgumentException("You problem is none of our business :: " + request.getType());
            }
        }
    }
}
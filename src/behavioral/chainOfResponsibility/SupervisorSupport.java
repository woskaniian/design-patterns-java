package behavioral.chainOfResponsibility;

public class SupervisorSupport extends SupportService {

    @Override
    public void handleRequest(ServiceRequest request) {
        if (request.getType() == ServiceLevel.LEVEL_TWO) {
            request.setConclusion("Supervisor solved level two request !!");
        } else {
            if (next != null) {
                next.handleRequest(request);
            } else {
                throw new IllegalArgumentException("No handler found for :: " + request.getType());
            }
        }
    }
}

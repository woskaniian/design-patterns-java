package behavioral.chainOfResponsibility;

// First handler
public class FrontDeskSupport extends SupportService {

    @Override
    public void handleRequest(ServiceRequest service) {
        if (service.getType() == ServiceLevel.LEVEL_ONE) {
            service.setConclusion("Front desk solved level one request !!");
        } else {
            if (next != null) {
                next.handleRequest(service);
            } else {
                throw new IllegalArgumentException("No handler found for :: " + service.getType());
            }
        }
    }
}

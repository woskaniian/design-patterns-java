package behavioral.mediator;

public class ConcreteMediator implements Mediator {
    private java.util.HashMap<String, Colleague> colleagues;

    public ConcreteMediator() {
        this.colleagues = new java.util.HashMap<>();
    }

    @Override
    public void sendMessage(String message, String colleagueNameFrom, String colleagueNameTo) {
        if (colleagueNameFrom.equals(colleagueNameTo)) {
            throw new RuntimeException("Colleague can not send message to himself");
        }
        Colleague colleagueTo = colleagues.get(colleagueNameTo);
        colleagueTo.receive(message, colleagueNameFrom);
    }

    @Override
    public void add(Colleague colleague) {
        this.colleagues.put(colleague.getName(), colleague);
    }
}

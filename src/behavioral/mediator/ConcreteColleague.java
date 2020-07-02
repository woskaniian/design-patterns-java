package behavioral.mediator;

public class ConcreteColleague extends Colleague {


    public ConcreteColleague(int id, String name, Mediator mediator) {
        super(id, name, mediator);
    }

    @Override
    public void receive(String message, String colleagueNameFrom) {
        System.out.println(String.format("Received message :: %s :: from :: %s", message, colleagueNameFrom));
    }

    @Override
    public void send(String message, String colleagueNameTo) {
        System.out.println(String.format("Sending message :: %s :: to :: %s :: from %s", message, colleagueNameTo, this.getName()));
        mediator.sendMessage(message, this.getName(), colleagueNameTo);
    }
}

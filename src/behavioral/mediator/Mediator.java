package behavioral.mediator;

public interface Mediator {

    void sendMessage(String message, String colleagueNameFrom, String colleagueNameTo);

    void add(Colleague colleague);
}

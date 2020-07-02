package behavioral.mediator;

public abstract class Colleague {

    private int id;
    private String name;
    protected Mediator mediator;

    public Colleague(int id, String name, Mediator mediator) {
        this.id = id;
        this.name = name;
        this.mediator = mediator;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public behavioral.mediator.Mediator getMediator() {
        return mediator;
    }

    public void setMediator(behavioral.mediator.Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive(String message, String colleagueFrom);

    public abstract void send(String message, String colleagueNameTo);

}

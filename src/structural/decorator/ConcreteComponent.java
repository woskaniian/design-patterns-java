package structural.decorator;

public class ConcreteComponent implements Component {
    private String someData;

    public ConcreteComponent(String someData) {
        this.someData = someData;
    }

    @Override
    public String getSomeData() {
        return someData;
    }
}

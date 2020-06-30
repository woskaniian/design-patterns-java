package structural.decorator;

public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public String getSomeData() {
        return "Decorated " + this.component.getSomeData();
    }
}

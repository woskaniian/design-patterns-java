package creational.abstractFactory;

public class FirstConcreteProductFactory extends AbstractProductFactory {
    @Override
    public AbstractProduct createProduct() {
        return new FirstConcreteProduct();
    }
}

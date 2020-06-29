package creational.abstractFactory;

public class SecondConcreteProductFactory extends AbstractProductFactory {
    @Override
    public AbstractProduct createProduct() {
        return new SecondConcreteProduct();
    }
}

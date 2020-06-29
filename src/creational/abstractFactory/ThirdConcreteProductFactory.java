package creational.abstractFactory;

public class ThirdConcreteProductFactory extends AbstractProductFactory {
    @Override
    public AbstractProduct createProduct() {
        return new ThirdConcreteProduct();
    }
}

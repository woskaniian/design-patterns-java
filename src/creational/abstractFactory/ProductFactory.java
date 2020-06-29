package creational.abstractFactory;

import java.util.Random;

public class ProductFactory {

    // Here decision about used factory class is done outside
    public static AbstractProduct createProduct(AbstractProductFactory abstractProductFactory) {
        return abstractProductFactory.createProduct();
    }

    // Here decision about used factory class is done inside
    public static AbstractProduct createProduct() {
        Random random = new Random();
        int type = random.nextInt(2);
        AbstractProductFactory factory;
        switch (type) {
            case 0:
                factory = new FirstConcreteProductFactory();
                break;
            case 1:
                factory = new SecondConcreteProductFactory();
                break;
            case 2:
                factory = new ThirdConcreteProductFactory();
                break;
            default:
                return null;
        }
        return factory.createProduct();
    }
}

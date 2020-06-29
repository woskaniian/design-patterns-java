package creational.factoryMethod;

public class ProductFactory {
    public static AbstractProduct createProduct(ProductType productType) {
        switch (productType) {
            case First:
                return new FirstConcreteProduct();
            case Second:
                return new SecondConcreteProduct();
            case Third:
                return new ThirdConcreteProduct();
            default:
                return null;
        }
    }
}

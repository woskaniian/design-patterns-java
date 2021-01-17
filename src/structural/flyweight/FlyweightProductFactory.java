package structural.flyweight;

import java.util.HashMap;

public class FlyweightProductFactory {
    private static final HashMap<ProductType, AbstractProduct> products;

    static {
        products = new HashMap<>();
    }

    public static AbstractProduct getProduct(ProductType productType) {
        AbstractProduct product = null;
        if (productType == ProductType.First) {
            products.putIfAbsent(ProductType.First, new FirstConcreteProduct());
            product = products.get(ProductType.First);
        }
        if (productType == ProductType.Second) {
            products.putIfAbsent(ProductType.Second, new SecondConcreteProduct());
            product = products.get(ProductType.Second);
        }
        return product;
    }
}

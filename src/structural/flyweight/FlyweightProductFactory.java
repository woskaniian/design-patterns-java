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
            product = products.get(ProductType.First);
            if (product == null) {
                product = new FirstConcreteProduct();
                products.put(ProductType.First, product);
            } else {
                product = products.get(ProductType.First);
            }
        }
        if (productType == ProductType.Second) {
            product = products.get(ProductType.Second);
            if (product == null) {
                product = new SecondConcreteProduct();
                products.put(ProductType.Second, product);
            } else {
                product = products.get(ProductType.Second);
            }
        }
        return product;
    }
}

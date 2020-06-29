import creational.builder.Product;
import creational.factoryMethod.AbstractProduct;
import creational.factoryMethod.ProductFactory;
import creational.factoryMethod.ProductType;
import creational.prototype.PrototypeCapable;
import creational.prototype.PrototypeCapableProduct;
import creational.singleton.EagerSingleton;
import creational.singleton.LazySingleton;

public class Main {
    public static void main(String[] args) {
        testCreationals();
        testStructurals();
        testBehaviorals();
    }

    public static void testCreationals() {
        System.out.println("Testing Creational patterns");
        testLazySingleton();
        testEagerSingleton();
        testPrototype();
        testFactoryMethod();
        testAbstractFactory();
        testBuilder();
    }


    public static void testLazySingleton() {
        System.out.println("Testing lazy singleton");
        LazySingleton singleton1 = LazySingleton.getInstance();
        LazySingleton singleton2 = LazySingleton.getInstance();
        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println();
    }

    public static void testEagerSingleton() {
        System.out.println("Testing eager singleton");
        EagerSingleton singleton1 = EagerSingleton.getInstance();
        EagerSingleton singleton2 = EagerSingleton.getInstance();
        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println();
    }

    private static void testPrototype() {
        long instantiationStartTime = System.nanoTime();
        PrototypeCapable prototype = new PrototypeCapableProduct("Field1Value", "Field2Value", 1, 2);
        long instantiationEndTime = System.nanoTime();
        long prototypingStartTime = 0;
        long prototypingEndTime = 0;
        PrototypeCapable product = null;
        try {
            prototypingStartTime = System.nanoTime();
            product = prototype.clone();
            prototypingEndTime = System.nanoTime();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(prototype);
        System.out.println(product);
        System.out.println("Time taken for instantiation: " + (instantiationEndTime - instantiationStartTime));
        System.out.println("Time taken for prototyping: " + (prototypingEndTime - prototypingStartTime));
        System.out.println();
    }

    public static void testFactoryMethod() {
        AbstractProduct product1 = ProductFactory.createProduct(ProductType.First);
        AbstractProduct product2 = ProductFactory.createProduct(ProductType.Second);
        AbstractProduct product3 = ProductFactory.createProduct(ProductType.Third);
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println();
    }

    public static void testAbstractFactory() {

    }

    public static void testBuilder() {
        Product.ProductBuilder builder = new Product.ProductBuilder("ReqField1Value", "ReqField2Value");
        Product product = builder
                .optionalField1("OptField1Value")
                .optionalField3("OptField3Value")
                .build();
        System.out.println(product);
        System.out.println();
    }

    public static void testStructurals() {

    }

    public static void testBehaviorals() {

    }
}

import creational.builder.Product;
import creational.prototype.PrototypeCapable;
import creational.prototype.PrototypeCapableProduct;
import creational.singleton.EagerSingleton;
import creational.singleton.LazySingleton;
import structural.flyweight.AbstractProduct;
import structural.flyweight.FlyweightProductFactory;
import structural.flyweight.ProductType;
import structural.proxy.Subject;
import structural.proxy.SubjectProxyUsingComposition;
import structural.proxy.SubjectProxyUsingInheritance;

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
        creational.factoryMethod.AbstractProduct product1 =
                creational.factoryMethod.ProductFactory.createProduct(creational.factoryMethod.ProductType.First);
        creational.factoryMethod.AbstractProduct product2 =
                creational.factoryMethod.ProductFactory.createProduct(creational.factoryMethod.ProductType.Second);
        creational.factoryMethod.AbstractProduct product3 =
                creational.factoryMethod.ProductFactory.createProduct(creational.factoryMethod.ProductType.Third);
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println();
    }

    public static void testAbstractFactory() {
        creational.abstractFactory.AbstractProduct productCreatedWithInnerDecision =
                creational.abstractFactory.ProductFactory.createProduct();
        creational.abstractFactory.AbstractProduct productCreatedWithOuterDecision =
                creational.abstractFactory.ProductFactory.createProduct(new creational.abstractFactory.FirstConcreteProductFactory());
        System.out.println(productCreatedWithInnerDecision);
        System.out.println(productCreatedWithOuterDecision);
        System.out.println();
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
        testProxy();
        testFlyweight();
    }

    private static void testProxy() {
        Subject subjectProxyUsingComposition = new SubjectProxyUsingComposition();
        Subject subjectProxyUsingInheritance = new SubjectProxyUsingInheritance();
        subjectProxyUsingComposition.doSomething();
        subjectProxyUsingInheritance.doSomething();
        System.out.println();
    }

    private static void testFlyweight() {
        AbstractProduct product1 = FlyweightProductFactory.getProduct(ProductType.First);
        AbstractProduct product2 = FlyweightProductFactory.getProduct(ProductType.First);
        AbstractProduct product3 = FlyweightProductFactory.getProduct(ProductType.Second);
        AbstractProduct product4 = FlyweightProductFactory.getProduct(ProductType.Second);
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);
    }

    public static void testBehaviorals() {

    }
}

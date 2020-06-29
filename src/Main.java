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
    }

    public static void testStructurals() {

    }

    public static void testBehaviorals() {

    }
}

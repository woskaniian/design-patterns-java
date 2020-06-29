import creational.singleton.EagerSingleton;
import creational.singleton.LazySingleton;

public class Main {
    public static void main(String[] args) {

    }

    public static void testCreationals() {
        System.out.println("Testing Creational patterns");
        testLazySingleton();
        testEagerSingleton();
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

    public static void testStructurals() {

    }

    public static void testBehaviorals() {

    }
}

package creational.singleton;

public class EagerSingleton {
    private static EagerSingleton instance;

    private EagerSingleton() {

    }

    static {
        instance = new EagerSingleton();
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}

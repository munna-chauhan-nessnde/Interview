package designpattern.creational.singleton;

/**
 * Singleton class. Eagerly initialized static instance guarantees thread safety.
 */
public final class SingletonFinal {

    /**
     * Static to class instance of the class.
     */
    private static final SingletonFinal INSTANCE = new SingletonFinal();

    /**
     * Private constructor so nobody can instantiate the class.
     */
    private SingletonFinal() {
    }

    /**
     * To be called by user to obtain instance of the class.
     *
     * @return instance of the singleton.
     */
    public static SingletonFinal getInstance() {
        return INSTANCE;
    }
}

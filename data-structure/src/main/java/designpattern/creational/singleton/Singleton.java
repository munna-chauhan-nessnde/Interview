package designpattern.creational.singleton;

/**
 * A class of which only a single instance can exist, and provide a global point of access to it.
 * Example : President of a country
 * <p>
 * The technique is as lazy as possible and works in all known versions of Java. It takes advantage
 * of language guarantees about class initialization, and will therefore work correctly in all
 * Java-compliant compilers and virtual machines.
 * <p>
 * The inner class is referenced no earlier (and therefore loaded no earlier by the class loader) than
 * the moment that getInstance() is called. Thus, this solution is thread-safe without requiring special
 * language constructs (i.e. volatile or synchronized).
 */
public class Singleton {

    /**
     * Private constructor.
     */
    private Singleton() {
    }

    /**
     * @return Singleton instance
     */
    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    /**
     * Provides the lazy-loaded Singleton instance.
     */
    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }

}

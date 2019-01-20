package designpattern.creational.singleton;

/**
 * Singleton pattern ensures that the class can have only one existing instance per Java classloader
 * instance and provides global access to it.
 * <p>
 * One of the risks of this pattern is that bugs resulting from setting a singleton up in a
 * distributed environment can be tricky to debug, since it will work fine if you debug with a
 * single classloader. Additionally, these problems can crop up a while after the implementation of
 * a singleton, since they may start out synchronous and only become async with time, so you it may
 * not be clear why you are seeing certain changes in behaviour.
 * <p>
 * There are many ways to implement the Singleton. The first one is the eagerly initialized instance
 * in {@link SingletonFinal}. Eager initialization implies that the implementation is thread safe. If
 * you can afford giving up control of the instantiation moment, then this implementation will suit
 * you fine.
 * <p>
 * The other option to implement eagerly initialized Singleton is enum based Singleton. The example
 * is found in {@link SingletonEnum}. At first glance the code looks short and simple. However, you
 * should be aware of the downsides including committing to implementation strategy, extending the
 * enum class, stabilizability and restrictions to coding.
 * <p>
 * Another Singleton implementation that is initialized on demand is found in
 * {@link SingletonThreadSafe}. It is somewhat faster than
 * {@link SingletonThreadSafe} since it doesn't synchronize the whole access method but
 * only the method internals on specific conditions.
 * <p>
 * Yet another way to implement thread safe lazily initialized Singleton can be found in
 * {@link Singleton}. However, this implementation requires at least Java 8
 * API level to work.
 */

public class SingletonMain {
    /**
     * Program entry point.
     *
     * @param args command line args
     */
    public static void main(String[] args) {

        // eagerly initialized singleton
        SingletonFinal singletonFinal1 = SingletonFinal.getInstance();
        SingletonFinal singletonFinal2 = SingletonFinal.getInstance();
        System.out.println(singletonFinal1);
        System.out.println(singletonFinal2);
        // enum singleton
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        SingletonEnum singletonEnum1 = SingletonEnum.INSTANCE;
        System.out.println(singletonEnum);
        System.out.println(singletonEnum1);

        // double checked locking
        SingletonThreadSafe dcl1 = SingletonThreadSafe.getInstance();
        System.out.println(dcl1.toString());
        SingletonThreadSafe dcl2 = SingletonThreadSafe.getInstance();
        System.out.println(dcl2.toString());

        // initialize on demand
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.toString());
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1.toString());
    }
}

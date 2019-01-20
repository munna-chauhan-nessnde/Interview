package designpattern.creational.singleton;

/**
 * A single-element enum type is the best way to implement a singleton
 * This implementation is thread safe, however adding any other method and its thread safety
 * is developers responsibility.
 */
public enum SingletonEnum {

    INSTANCE;

    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
}

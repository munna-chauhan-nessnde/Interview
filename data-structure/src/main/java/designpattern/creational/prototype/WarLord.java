package designpattern.creational.prototype;

/**
 * WarLord
 */
public abstract class WarLord extends Prototype {

    @Override
    public abstract WarLord copy() throws CloneNotSupportedException;

}

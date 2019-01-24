package designpattern.creational.prototype;

/**
 * Interface for the factorymethod class.
 */
public interface HeroFactory {

    Mage createMage();

    WarLord createWarLord();

    Beast createBeast();

}

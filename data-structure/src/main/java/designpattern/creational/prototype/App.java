package designpattern.creational.prototype;

/**
 * The Prototype pattern is a creational design pattern in software development. It is used when the
 * type of objects to create is determined by a prototypical instance, which is cloned to produce
 * new objects. This pattern is used to: - avoid subclasses of an object creator in the client
 * application, like the abstract factorymethod pattern does. - avoid the inherent cost of creating a new
 * object in the standard way (e.g., using the 'new' keyword)
 * <p>
 * In this example we have a factorymethod class ({@link HeroFactoryImpl}) producing objects by cloning
 * the existing ones. The factorymethod's prototype objects are given as constructor parameters.
 */
public class App {
    /**
     * Program entry point
     *
     * @param args command line args
     */
    public static void main(String[] args) {
        HeroFactory factory;
        Mage mage;
        WarLord warlord;
        Beast beast;

        factory = new HeroFactoryImpl(new ElfMage("cooking"), new ElfWarLord("cleaning"), new ElfBeast("protecting"));
        mage = factory.createMage();
        warlord = factory.createWarLord();
        beast = factory.createBeast();
        System.out.println(mage.toString());
        System.out.println(warlord.toString());
        System.out.println(beast.toString());

        factory = new HeroFactoryImpl(new OrcMage("axe"), new OrcWarLord("sword"), new OrcBeast("laser"));
        mage = factory.createMage();
        warlord = factory.createWarLord();
        beast = factory.createBeast();
        System.out.println(mage.toString());
        System.out.println(warlord.toString());
        System.out.println(beast.toString());
    }
}

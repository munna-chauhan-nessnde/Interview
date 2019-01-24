package designpattern.creational.prototype;

/**
 * ElfWarLord
 */
public class ElfWarLord extends WarLord {

    private String helpType;

    public ElfWarLord(String helpType) {
        this.helpType = helpType;
    }

    public ElfWarLord(ElfWarLord elfWarLord) {
        this.helpType = elfWarLord.helpType;
    }

    @Override
    public ElfWarLord copy() {
        return new ElfWarLord(this);
    }

    @Override
    public String toString() {
        return "Elven warlord helps in " + helpType;
    }

}

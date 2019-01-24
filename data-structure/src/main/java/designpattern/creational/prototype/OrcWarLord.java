package designpattern.creational.prototype;

/**
 * OrcWarLord
 */
public class OrcWarLord extends WarLord {

    private String weapon;

    public OrcWarLord(String weapon) {
        this.weapon = weapon;
    }

    public OrcWarLord(OrcWarLord orcWarLord) {
        this.weapon = orcWarLord.weapon;
    }

    @Override
    public OrcWarLord copy() {
        return new OrcWarLord(this);
    }

    @Override
    public String toString() {
        return "Orcish warlord attacks with " + weapon;
    }

}

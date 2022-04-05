package banque.model;

public class Berserker extends Humanoid {
    private int rage;

    public Berserker(String name, double health, int force, int rage) {
        super(name, health, force);
        this.rage = rage;
    }

    public void useRage(Humanoid h) {

    }

    public void addRage(int rage) {
        this.rage = this.rage + rage;
    }
}

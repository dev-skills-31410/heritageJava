package banque.model;

public class Wizard extends Humanoid {
    private int mana;
    private int intelligence;
    private boolean shield;
    private int hitsOnShield;


    public Wizard(String name, double health, int force, int mana, int intelligence, boolean shield, int hitsOnShield) {
        super(name, health, force);
        this.mana = mana;
        this.intelligence = intelligence;
        this.shield = shield;
        this.hitsOnShield = hitsOnShield;
    }

    public void spellCast(Humanoid h) {
        if((this.mana - 10) > 0) {
            super.force = super.force + this.intelligence;
        }
    }

    public void activateShield() {
        if((this.mana - 10) > 0) {
            this.shield = true;
        }
    }

    public void addMana(int mana) {
        this.mana = this.mana + mana;
    }
}

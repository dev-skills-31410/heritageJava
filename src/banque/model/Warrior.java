package banque.model;

public class Warrior extends Humanoid {
    private boolean doubleAttackReady;

    public Warrior(String name, double health, int force, boolean doubleAttackReady) {
        super(name, health, force);
        this.doubleAttackReady = doubleAttackReady;
    }

    public void doubleAttack(Humanoid h) {
        if(doubleAttackReady == true) {
            super.force = (int) (super.force * 0.7);
        }
    }
}

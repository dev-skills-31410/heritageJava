package org.humanBooster.monprojet.model;

public class CompteEpargne extends Compte {
    private int taux;

    public CompteEpargne(int solde, int taux) {
        super(solde);
        this.taux = taux;
    }

    public float calculInterests() {

        return super.solde * 0.75f;

    }
}

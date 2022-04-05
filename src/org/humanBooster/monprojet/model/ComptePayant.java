package org.humanBooster.monprojet.model;

public class ComptePayant extends Compte {
    public ComptePayant(int solde) {
        super(solde);
    }

    @Override
    public void verser(float montant) {
        super.solde = super.solde + montant - 1;
    }

    @Override
    public void retirer(float montant) {
        if((super.solde - montant -1) > 0) {
            super.solde = super.solde - montant - 1;
        }

    }
}

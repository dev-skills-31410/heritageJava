package org.humanBooster.monprojet.model;

public class CompteSimple extends Compte{
    private float decouvert;

    public CompteSimple(int solde, float decouvert) {
        super(solde);
        this.decouvert = decouvert;
    }

    @Override
    public void retirer(float montant) {
        boolean soldeOk = (super.solde - montant) >= decouvert ? true : false;
        if(soldeOk == true) {

            super.solde = super.solde - montant;
            System.out.println(super.solde);
        }
    }
}
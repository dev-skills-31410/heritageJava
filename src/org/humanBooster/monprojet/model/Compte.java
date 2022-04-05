package org.humanBooster.monprojet.model;

public class Compte {
    private int id;
    protected float solde;
    private static int countComptes;

    public Compte( int solde) {
        this.id = countComptes+ 1;
        this.solde = solde;
        this.countComptes = countComptes + 1;
    }

    public void verser(float montant){
        this.solde += montant;
        System.out.println(this.id);
        System.out.println(this.solde);
    }
    public void retirer(float montant){
        if((this.solde - montant) > 0) {
            System.out.println(this.id);
            this.solde = this.solde - montant;
            System.out.println(this.solde);
        }

    }
}
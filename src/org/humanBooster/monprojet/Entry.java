package org.humanBooster.monprojet;

import org.humanBooster.monprojet.model.Compte;
import org.humanBooster.monprojet.model.CompteEpargne;
import org.humanBooster.monprojet.model.ComptePayant;
import org.humanBooster.monprojet.model.CompteSimple;

public class Entry {
    public static void main(String[] args) {
        ComptePayant cp = new ComptePayant(120);
        CompteEpargne ce = new CompteEpargne(120, 3);
        CompteSimple cs = new CompteSimple(120, 40);
        Compte c = new Compte(23);

        c.retirer(12f);
        ce.verser(3);
        cs.verser(4);
        cs.retirer(12);
        c.verser(4);
        c.retirer(6);
        //
        c.retirer(600);
        cs.retirer(700);
    }
}

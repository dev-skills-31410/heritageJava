package abstractClass;

import abstractClass.model.*;

import java.util.ArrayList;

public class Entry {
    public static void main(String[] args) {
        ArrayList<Vehicule> vehicules = new ArrayList<>();
        vehicules.add(new Voiture(12, "Peugeot"));
        vehicules.add(new Avion(12, "Airbus"));
        vehicules.add(new Boat(12, "Bateau"));
        vehicules.add(new Avion(18, "A340"));
        vehicules.add(new Voiture(14, "Citroen"));
        Owner o1 = new Owner("first owner", vehicules);
        o1.startAllVehicules();
    }
}

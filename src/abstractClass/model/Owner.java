package abstractClass.model;

import java.util.ArrayList;

public class Owner {
    private String name;
    private ArrayList<Vehicule> v = new ArrayList<>();


    public Owner(String name, ArrayList<Vehicule> v) {
        this.name = name;
        this.v = v;
    }

    public void countByBrand(String brand) {
        int count = 0;
        for (Vehicule vehicule : v) {
            if(vehicule.brand.equals(brand)) {
                count += 1;
            }
        }
        System.out.println("il y a " + count + " véhicules de marques " + brand);
    }

    public void add(Vehicule vehicule) {
        this.v.add(vehicule);
    }
}

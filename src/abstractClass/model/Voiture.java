package abstractClass.model;

public class Voiture extends Vehicule {
    public Voiture(int engine, String brand) {
        super(engine, brand);
    }

    @Override
    public void start() {
        System.out.println("prend la route");
    }

    @Override
    public void stop() {
        System.out.println("se gare sur le bas côté");
    }
}

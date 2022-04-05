package abstractClass.model;

public class Boat extends Vehicule {
    public Boat(int engine, String brand) {
        super(engine, brand);
    }

    @Override
    public void start() {
        System.out.println("le bateau lève l'encre");
    }

    @Override
    public void stop() {
        System.out.println("le bateau jette son encre");
    }
}

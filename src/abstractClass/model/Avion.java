package abstractClass.model;

public class Avion extends Vehicule{
    public Avion(int engine, String brand) {
        super(engine, brand);
    }

    @Override
    public void start() {
        System.out.println("décolle");
    }

    @Override
    public void stop() {
        System.out.println("attérit");
    }
}

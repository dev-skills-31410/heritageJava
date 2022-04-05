package abstractClass.model;

public abstract class Vehicule {
    private int engine;
    protected String brand;

    public Vehicule(int engine, String brand) {
        this.engine = engine;
        this.brand = brand;
    }

    public abstract void start();
    public abstract void stop();

    public void displayEngine() {
        System.out.println("le véhicule " + this.brand + " a une puissance moteur de " + this.engine);
    }
}

// peugeot -> nbVehiculePeugeot

package implementation.model;

public class Livre extends Media implements Lisable{
    @Override
    public void open() {
        System.out.println("livre ouvert");
    }
}

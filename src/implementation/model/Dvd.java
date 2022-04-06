package implementation.model;

public class Dvd extends Media implements Lisable{

    @Override
    public void open() {
        System.out.println("lecture du menu");
    }
}

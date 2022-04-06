package implementation.model;

public class Mp3 extends Media implements Lisable, Ecoutable{
    @Override
    public void startAudio() {
        System.out.println("lecture mp3 4mhz");
    }

    @Override
    public void open() {
        System.out.println("ouverture mp3");
    }
}

package implementation.model;

public class LivreAudio extends Livre implements Ecoutable{
    @Override
    public void startAudio() {
        System.out.println("propose le sommaire");
    }
}

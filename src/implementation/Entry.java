package implementation;

import implementation.model.*;

import java.util.ArrayList;

public class Entry {
    public static void main(String[] args) {
        ArrayList<Media> m = new ArrayList<>();
        m.add(new Dvd());
        m.add(new Livre());
        m.add(new LivreAudio());
        m.add(new Mp3());
        m.add(new Image());

        for (Media media : m) {
            if(media instanceof Lisable) {
                ((Lisable) media).open();
            }
            if(media instanceof Ecoutable) {
                ((Ecoutable) media).startAudio();
            }
        }
    }
}

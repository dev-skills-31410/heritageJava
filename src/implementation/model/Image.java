package implementation.model;

public class Image extends Media implements Lisable{
    @Override
    public void open() {
        System.out.println("image décompressée");
    }
}

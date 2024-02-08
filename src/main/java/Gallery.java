import java.util.ArrayList;

public class Gallery {

    private String name;
    private double till;
    private ArrayList<Artwork> stock;

    public Gallery(String name){
        this.name = name;
        this.till = 0;
        this.stock = new ArrayList<>();
    }

//    Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public double getTill() {

        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public ArrayList<Artwork> getStock() {
        return stock;
    }

    public void addArtwork(Artwork artwork){
        this.stock.add(artwork);
    }

    public void removeArtwork(Artwork artwork){
        this.stock.remove(artwork);
    }

    //METHODS
    public void addToTill(double fish){
        this.till += fish;
    }
}

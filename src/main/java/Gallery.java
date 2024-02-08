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
        return this.till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public ArrayList<Artwork> getStock() {
        return this.stock;
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

    public double stockTake(){
        double totalFish = 0;
        for(Artwork art : this.stock){
            totalFish += art.getPrice();
        }
        return totalFish;
    }
}

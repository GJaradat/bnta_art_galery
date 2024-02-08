import java.util.ArrayList;

public class Customer {

    private String name;
    private double wallet;
    private ArrayList<Artwork> artCollection;


    public Customer(String name,double wallet){
        this.name = name;
        this.wallet = wallet;
        artCollection = new ArrayList<>();
    }

    //Getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public ArrayList<Artwork> getArtCollection() {
        return artCollection;
    }

    public void addToCollection(Artwork artwork){
        this.artCollection.add(artwork);
    }

    public void removeFromCollection(Artwork artwork){
        this.artCollection.remove(artwork);
    }

    //METHODS
    public void purchase(Gallery gallery, Artwork artwork){
        if ((this.wallet >= artwork.getPrice()) && (gallery.getStock().contains(artwork))){
            this.wallet -= artwork.getPrice();
            gallery.addToTill(artwork.getPrice());

            gallery.removeArtwork(artwork);
            this.addToCollection(artwork);
        }
    }
}

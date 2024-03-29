public class Artwork {

    private String title;
    private Artist artist;
    private double price;

    public Artwork(String title, Artist artist, double price){
        this.title = title;
        this.artist = artist;
        this.price = price;
    }

    //Getters Setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist.getName();
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}

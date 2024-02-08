public class Customer {

    private String name;
    private double wallet;

    public Customer(String name,double wallet){
        this.name = name;
        this.wallet = wallet;
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


    //METHODS
    public void purchase(Gallery gallery, Artwork artwork){
        if ((this.wallet >= artwork.getPrice()) && (gallery.getStock().contains(artwork))){
            gallery.addToTill(artwork.getPrice());
            this.wallet -= artwork.getPrice();
        }
    }
}

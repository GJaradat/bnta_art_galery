import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer customer;
    Gallery gallery;
    Artwork artwork;
    Artist artist;

    @BeforeEach
    public void setUp(){
        customer = new Customer("Skipper",1_000_000);
        artist = new Artist("Pablo");
        artwork = new Artwork("Penguin Of Peace", artist, 1_000_000);
        gallery = new Gallery("The Rookery");
    }

    @Test
    public void canGetName(){
        assertThat(customer.getName()).isEqualTo("Skipper");
    }

    @Test
    public void canSetName(){
        customer.setName("Kowalski");
        assertThat(customer.getName()).isEqualTo("Kowalski");
    }

    @Test
    public void canGetWallet(){
        assertThat(customer.getWallet()).isEqualTo(1_000_000);
    }

    @Test
    public void canSetWallet(){
        customer.setWallet(2_000_000);
        assertThat(customer.getWallet()).isEqualTo(2_000_000);
    }

    //METHOD TESTING SUITE
    @Test
    public void canPurchase(){
        gallery.addArtwork(artwork);
        customer.purchase(gallery,artwork);
        assertThat(customer.getWallet()).isEqualTo(0);
        assertThat(gallery.getTill()).isEqualTo(1_000_000);
    }
}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery gallery;
    Artist artist;
    Artwork artwork;
    Artwork artwork2;

    @BeforeEach
    public void setUp(){
        artist = new Artist("Pablo");
        artwork = new Artwork("Penguin Of Peace", artist, 1_000_000);
        artwork2 = new Artwork("Child With Penguin", artist, 750_000);
        gallery = new Gallery("The Rookery");
    }

    @Test
    public void canGetName(){
        assertThat(gallery.getName()).isEqualTo("The Rookery");
    }

    @Test
    public void canSetName(){
        gallery.setName("Peanut Gallery");
        assertThat(gallery.getName()).isEqualTo("Peanut Gallery");
    }

    @Test
    public void canGetTill(){
        assertThat(gallery.getTill()).isEqualTo(0);
    }

    @Test
    public void canSetTill(){
        gallery.setTill(1_000);
        assertThat(gallery.getTill()).isEqualTo(1_000);
    }

    @Test
    public void canGetStock(){
        ArrayList<Artwork> expected = new ArrayList<>();
        assertThat(gallery.getStock()).isEqualTo(expected);
    }

    @Test
    public void canAddArtwork(){
        gallery.addArtwork(artwork);
        assertThat(gallery.getStock().size()).isEqualTo(1);
    }

    @Test
    public void canRemoveArtwork(){
        gallery.addArtwork(artwork);
        gallery.removeArtwork(artwork);
        assertThat(gallery.getStock().size()).isEqualTo(0);
    }

    @Test
    public void canAddToTill(){
        gallery.addToTill(100);
        assertThat(gallery.getTill()).isEqualTo(100);
    }

    @Test
    public void canTakeStock(){
        gallery.addArtwork(artwork);
        gallery.addArtwork(artwork2);
        assertThat(gallery.getStock().size()).isEqualTo(2);
        assertThat(gallery.stockTake()).isEqualTo(1_750_000);
    }

}

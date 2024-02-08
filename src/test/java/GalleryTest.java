import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery gallery;
    Artist artist;
    Artwork artwork;

    @BeforeEach
    public void setUp(){
        artist = new Artist("Pablo");
        artwork = new Artwork("Penguin Of Peace", artist, 1_000_000);
        gallery = new Gallery("The Rookery");
    }

    @Test
    public void getName(){
        assertThat(gallery.getName()).isEqualTo("The Rookery");
    }

    @Test
    public void setName(){
        gallery.setName("Peanut Gallery");
        assertThat(gallery.getName()).isEqualTo("Peanut Gallery");
    }

    @Test
    public void getTill(){
        assertThat(gallery.getTill()).isEqualTo(0);
    }

    @Test
    public void setTill(){
        gallery.setTill(1_000);
        assertThat(gallery.getTill()).isEqualTo(1_000);
    }

    @Test
    public void getStock(){
        ArrayList<Artwork> expected = new ArrayList<>();
        assertThat(gallery.getStock()).isEqualTo(expected);
    }

    @Test
    public void addArtwork(){
        gallery.addArtwork(artwork);
        assertThat(gallery.getStock().size()).isEqualTo(1);
    }

    @Test
    public void removeArtwork(){
        gallery.addArtwork(artwork);
        gallery.removeArtwork(artwork);
        assertThat(gallery.getStock().size()).isEqualTo(0);
    }

}
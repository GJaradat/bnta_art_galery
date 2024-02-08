import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    Artist artist;
    Artist artist2;
    Artwork artwork;

    @BeforeEach
    public void setUp(){
        artist = new Artist("Pablo");
        artist2 = new Artist("Pingu");
        artwork = new Artwork("Penguin Of Peace", artist, 1_000_000);
    }

    @Test
    public void canGetTitle(){
        assertThat(artwork.getTitle()).isEqualTo("Penguin Of Peace");
    }

    @Test
    public void canSetTitle(){
        artwork.setTitle("Child With Penguin");
        assertThat(artwork.getTitle()).isEqualTo("Child With Penguin");
    }

    @Test
    public void canGetArtist(){
        assertThat(artwork.getArtist()).isEqualTo("Pablo");
    }

    @Test
    public void canSetArtist(){
        artwork.setArtist(artist2);
        assertThat(artwork.getArtist()).isEqualTo("Pingu");
    }

    @Test
    public void canGetPrice(){
        assertThat(artwork.getPrice()).isEqualTo(1_000_000);
    }

    @Test
    public void canSetPrice(){
        artwork.setPrice(500_000);
        assertThat(artwork.getPrice()).isEqualTo(500_000);
    }

}

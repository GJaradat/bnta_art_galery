import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {

    Artist artist;

    @BeforeEach
    public void setUp(){
        artist = new Artist("Pablo");
    }

    @Test
    public void getName() {
        assertThat(artist.getName()).isEqualTo("Pablo");
    }

    @Test
    public void setName() {
        artist.setName("Picasso");
        assertThat(artist.getName()).isEqualTo("Picasso");
    }


}

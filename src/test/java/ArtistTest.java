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
    public void canGetName() {
        assertThat(artist.getName()).isEqualTo("Pablo");
    }

    @Test
    public void canSetName() {
        artist.setName("Picasso");
        assertThat(artist.getName()).isEqualTo("Picasso");
    }


}

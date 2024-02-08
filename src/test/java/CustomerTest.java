import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer customer;

    @BeforeEach
    public void setUp(){
        customer = new Customer("Skipper",1_000_000);
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


}

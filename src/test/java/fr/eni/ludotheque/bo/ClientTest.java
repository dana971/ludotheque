package fr.eni.ludotheque.bo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

//@SpringBootTest
public class ClientTest {
    @Test
    public void testCreationClient() {

        Client client = new Client("Smith", "Bob", "Smith@gmail.com", "0606060606");

        assertThat(client).isNotNull();
        assertThat(client.getId()).isNull();
        assertThat(client.getNom()).isEqualTo("Smith");
        assertThat(client.getPrenom()).isEqualTo("Bob");
        assertThat(client.getEmail()).isNotNull();
        assertThat(client.getNo_telephone()).isNotNull();
    }
}

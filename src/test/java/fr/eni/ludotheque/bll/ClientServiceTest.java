package fr.eni.ludotheque.bll;

import fr.eni.ludotheque.bo.Addresse;
import fr.eni.ludotheque.bo.Client;
import fr.eni.ludotheque.dal.ClientRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ClientServiceTest {

    @Autowired
    private ClientService clientService;

    @MockitoBean
    private ClientRepository clientRepository;

    @Test
    @DisplayName("Test d'ajout d'un client")
    public void addClient(){

        Addresse adresse = new Addresse(2,"Allée de Bagatelle","44800", "Saint-Herblain");
        Client client = new Client("LAPORTE","KEVIN","pinguchieur@pin.gu","0102030405", adresse);

        org.mockito.Mockito.doAnswer((invocation) -> {
            Client cli = invocation.getArgument(0);
            cli.setId(999);
            return cli;
        }).when(clientRepository).save(client);

        //Act
        clientService.addClient(client);

        //Assert
        assertThat(client.getId()).isNotNull();
        assertThat(client.getId()).isEqualTo(999);

    }
}

package tests;

import model.Client;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import repositories.ClientRepository;
import services.ClientService;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FindClientByCNPTests {

  @Test
  @DisplayName("Testing that an empty Optional is returned when " +
          "the client is not found in the database.")
  public void findClientByCNPNoClientTest() {
    ClientRepository clientRepository = mock(ClientRepository.class);
    ClientService clientService = new ClientService(clientRepository);

    when(clientRepository.findClientByCNP("12345"))
            .thenReturn(Optional.empty());

    Optional<Client> client = clientService.findClientByCNP("12345");

    assertTrue(client.isEmpty());
  }
}

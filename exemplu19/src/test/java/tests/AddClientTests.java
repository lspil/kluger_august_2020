package tests;

import exceptions.ExistingClientException;
import model.Client;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import repositories.ClientRepository;
import services.ClientService;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class AddClientTests {

  @Test
  @DisplayName("Testing that a client is added when no client " +
          "having the same CNP exists.")
  public void addClientWhenClientDoesntExistTest() {
    ClientRepository clientRepository = mock(ClientRepository.class);
    ClientService clientService = new ClientService(clientRepository);

    Client client = new Client();
    client.setName("test");
    client.setCnp("12345");

    when(clientRepository.findClientByCNP(client.getCnp()))
            .thenReturn(Optional.empty());

    clientService.addClient(client);

    verify(clientRepository).addClient(client);
  }

  @Test
  @DisplayName("Testing that a client is not added and an exception is thrown" +
          " when a client having the same CNP exists.")
  public void addClientWhenClientExistsTest() {
    ClientRepository clientRepository = mock(ClientRepository.class);
    ClientService clientService = new ClientService(clientRepository);

    Client client = new Client();
    client.setName("test");
    client.setCnp("12345");

    when(clientRepository.findClientByCNP(client.getCnp()))
            .thenReturn(Optional.of(client));

    assertThrows(ExistingClientException.class,
            () -> clientService.addClient(client));

    verify(clientRepository, never()).addClient(client);
  }
}

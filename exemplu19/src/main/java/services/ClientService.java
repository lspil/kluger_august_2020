package services;

import exceptions.ExistingClientException;
import model.Client;
import repositories.ClientRepository;

import java.util.Optional;

public class ClientService {

  private ClientRepository clientRepository;

  public ClientService(ClientRepository clientRepository) {
    this.clientRepository = clientRepository;
  }

  public void addClient(Client client) {
    Optional<Client> c = clientRepository.findClientByCNP(client.getCnp());

    if (c.isEmpty()) {
      clientRepository.addClient(client);
    } else {
      throw new ExistingClientException();
    }
  }

  public Optional<Client> findClientByCNP(String cnp) {
    return clientRepository.findClientByCNP(cnp);
  }
}

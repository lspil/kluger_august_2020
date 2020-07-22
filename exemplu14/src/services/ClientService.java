package services;

import model.Client;
import repositories.ClientRepository;
import repositories.ClientRepositoryImpl;

public class ClientService {

  private ClientRepository clientRepository = ClientRepositoryImpl.getInstance();

  public void adaugaClient(Client client) {
    clientRepository.adaugaClient(client);
  }
}

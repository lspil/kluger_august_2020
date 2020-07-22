package repositories;

import exceptions.ClientDoesNotExistException;
import model.Client;

import java.util.HashMap;
import java.util.Map;

public class ClientRepositoryImpl implements ClientRepository {
  private static ClientRepositoryImpl INSTANCE; // null

  private Map<Client, Integer> clients = new HashMap<>();

  private ClientRepositoryImpl() {}

  public static ClientRepository getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new ClientRepositoryImpl();
    }

    return INSTANCE;
  }

  @Override
  public void adaugaClient(Client client) {
    clients.put(client, 0);
  }

  @Override
  public void incrementDeliveryNo(Client client) {
    if (clients.containsKey(client)) {
      clients.put(client, clients.get(client) + 1);
    } else {
      throw new ClientDoesNotExistException();
    }
  }
}

package repositories;

import model.Client;

public interface ClientRepository {

  void adaugaClient(Client client);
  void incrementDeliveryNo(Client client);
}

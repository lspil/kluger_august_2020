package repositories;

import model.Client;

import java.util.Optional;

public interface ClientRepository {

  void addClient(Client client);
  Optional<Client> findClientByCNP(String cnp);

  static ClientRepository getInstance() {
    return new MySQLClientRepository();
  }
}

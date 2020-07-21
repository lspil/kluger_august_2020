package repository;

import model.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientRepository {
  private static ClientRepository INSTANCE;

  private List<Client> clienti = new ArrayList<>();

  private ClientRepository() {}

  public static ClientRepository getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new ClientRepository();
    }
    return INSTANCE;
  }

  public void adaugaClient(Client client) {
    clienti.add(client);
  }

  public List<Client> searchByNameAndCNP(String search) {
    List<Client> result = new ArrayList<>();

    for (Client c : clienti) {
      if (c.getNume().contains(search) ||
          c.getCnp().contains(search)) {
        result.add(c);
      }
    }

    return result;
  }

  public Client searchByCNP(String cnp) {
    for (Client c : clienti) {
      if (c.getCnp().equals(cnp)) {
        return c;
      }
    }

    return null;
  }
}

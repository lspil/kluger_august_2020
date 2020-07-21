package service;

import exceptions.AlreadyExistingCardException;
import exceptions.ClientNotFoundException;
import managers.CardManager;
import model.Card;
import model.Client;
import repository.ClientRepository;

import java.util.List;

public class ClientService {

  private ClientRepository clientRepository = ClientRepository.getInstance();
  private CardManager cardManager = CardManager.getInstance();

  public void adaugaClient(Client client) {
    clientRepository.adaugaClient(client);
  }

  public List<Client> searchByNameAndCNP(String search) {
    return clientRepository.searchByNameAndCNP(search);
  }

  public void adaugaCard(String cnp, Card card) {
    Client c = clientRepository.searchByCNP(cnp);

    if (c != null) {
      cardManager.validateCard(card, c);
      c.getCarduri().add(card);
    } else {
      throw new ClientNotFoundException();
    }
  }

}

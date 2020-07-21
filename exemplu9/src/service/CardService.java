package service;

import exceptions.CardNotFoundException;
import exceptions.NotEnoughMoneyException;
import model.Card;
import model.CardDeCredit;
import model.CardDeDebit;
import model.Client;
import repository.ClientRepository;

import java.util.List;

public class CardService {

  private ClientRepository clientRepository = ClientRepository.getInstance();

  public void depunereNumerar(String cnp, String numar, double suma) {
    Client client = clientRepository.searchByCNP(cnp);
    List<Card> carduri = client.getCarduri();

    for (Card c : carduri) {
      if (c.getNumar().equals(numar)) {
        c.setSold(c.getSold() + suma);
        return;
      }
    }

    throw new CardNotFoundException();
  }

  public void retragereNumerar(String cnp, String numar, double suma) {
    Client client = clientRepository.searchByCNP(cnp);
    List<Card> carduri = client.getCarduri();

    for (Card c : carduri) {
      if (c.getNumar().equals(numar)) {
        if (c instanceof CardDeDebit) {
          retragereNumerarCardDebit(suma, c);
        } else {
          retragereNumerarCardCredit(suma, c);
        }
      }
    }
  }

  private void retragereNumerarCardCredit(double suma, Card c) {
    CardDeCredit cc = (CardDeCredit) c;
    if (cc.getSold() + cc.getLimit() >= suma) {
      c.setSold(c.getSold() - suma);
    } else {
      throw new NotEnoughMoneyException();
    }
  }

  private void retragereNumerarCardDebit(double suma, Card c) {
    if (c.getSold() >= suma) {
      c.setSold(c.getSold() - suma);
    } else {
      throw new NotEnoughMoneyException();
    }
  }

}

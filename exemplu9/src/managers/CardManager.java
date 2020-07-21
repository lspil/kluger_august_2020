package managers;

import exceptions.AlreadyExistingCardException;
import model.Card;
import model.Client;

import java.util.List;

public class CardManager {

  private CardManager() {}

  // bill pugh
  private static class SingletonHolder {
    private static CardManager INSTANCE = new CardManager();
  }

  public static CardManager getInstance() {
    return SingletonHolder.INSTANCE;
  }

  public void validateCard(Card card, Client c) {
    List<Card> cards = c.getCarduri();
    for (Card x : cards) {
      if (x.getNumar().equals(card.getNumar())) {
        throw new AlreadyExistingCardException();
      }
    }
  }
}

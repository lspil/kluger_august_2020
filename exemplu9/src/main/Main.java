package main;

import model.Card;
import model.Client;
import service.CardService;
import service.ClientService;

public class Main {

  public static void main(String[] args) {

    /**
     * Aplicatie care administreaza clientii si conturile unei banci.
     *
     * Cazuri de utilizare
     *
     *  - Adaugam un client
     *  - Cautare dupa client (nume si cnp)
     *  - Adaugare card unui client
     *  - Depunere numerar pe un anumit card
     *  - Retragere numerar de pe un anumit card
     *
     *  Model:
     *
     *    Client: nume, cnp
     *    Card
     *      - CardDeCredit: numar (8 cifre), sold, limita
     *            sold: 100, limita: 50, 150 lei ---> -50
     *      - CardDeDebit: numar (8 cifre), sold
     *
     */

    Client c = new Client();
    c.setCnp("12345");

    ClientService clientService = new ClientService();
    clientService.adaugaClient(c);

    CardService cardService = new CardService();
    cardService.depunereNumerar("12345", "55555", 10);
  }
}

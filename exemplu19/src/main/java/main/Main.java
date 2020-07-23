package main;

import model.Account;
import model.Client;
import repositories.AccountRepository;
import repositories.ClientRepository;
import repositories.MySQLClientRepository;
import services.AccountService;
import services.ClientService;

public class Main {

  public static void main(String[] args) {
    /**
     * Baza de date:
     *  client
     *    id (PK), name, cnp
     *
     *  account
     *    id (PK), amount, client (FK)
     *
     *  transaction
     *    id (PK), amount, account (FK)
     *
     * Cazuri de utilizare:
     *
     *  - adaugarea unui client
     *  - find client by cnp
     *  - adaugarea unui cont pentru un client
     *  - efectuare tranzactie (suma, acc1, acc2)
     *      * acc1 - are suficienti bani
     *
     *  Teste unitare!
     */

//    ClientRepository clientRepository = ClientRepository.getInstance();
//    ClientService clientService = new ClientService(clientRepository);
//
//    Client c = new Client();
//    c.setName("Gigel");
//    c.setCnp("12345");
//
//    clientService.addClient(c);

//    AccountRepository accountRepository = AccountRepository.getInstance();
//    ClientRepository clientRepository = ClientRepository.getInstance();
//    AccountService accountService =
//            new AccountService(accountRepository, clientRepository);
//
//    Account a = new Account();
//    a.setAmount(1000);
//
//    Client c = new Client();
//    c.setCnp("12345");
//
//    a.setClient(c);
//
//    accountService.addAccount(a);
  }
}

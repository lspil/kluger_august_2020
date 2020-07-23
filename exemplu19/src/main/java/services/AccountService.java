package services;

import exceptions.InexistentClientException;
import model.Account;
import model.Client;
import org.apache.log4j.Logger;
import repositories.AccountRepository;
import repositories.ClientRepository;

import java.util.Optional;

public class AccountService {

  private static Logger logger = Logger.getLogger(AccountService.class.getName());

  private ClientRepository clientRepository;
  private AccountRepository accountRepository;

  public AccountService(AccountRepository accountRepository,
                        ClientRepository clientRepository) {
    this.accountRepository = accountRepository;
    this.clientRepository = clientRepository;
  }

  public void addAccount(Account account) {
    logger.info("Starting add account...");
    Optional<Client> client =
            clientRepository.findClientByCNP(account.getClient().getCnp());

    Client c = client.orElseThrow(() -> new InexistentClientException());

    account.setClient(c);

    accountRepository.addAccount(account);
  }
}

package tests;

import exceptions.InexistentClientException;
import model.Account;
import model.Client;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import repositories.AccountRepository;
import repositories.ClientRepository;
import services.AccountService;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class AddAccountTests {

  @Test
  @DisplayName("Testing an exception is thrown when trying to " +
          "add an account for a client that doesn't exist.")
  public void addAccountClientDoesntExistTest() {
    AccountRepository accountRepository = mock(AccountRepository.class);
    ClientRepository clientRepository = mock(ClientRepository.class);

    AccountService accountService =
            new AccountService(accountRepository, clientRepository);

    Account a = new Account();
    Client c = new Client();
    c.setCnp("12345");
    a.setClient(c);

    when(clientRepository.findClientByCNP(c.getCnp()))
            .thenReturn(Optional.empty());

    assertThrows(InexistentClientException.class,
            () -> accountService.addAccount(a));

    verify(accountRepository, never()).addAccount(a);
  }

  @Test
  @DisplayName("Testing an account is added for the given client " +
          "if the client exists.")
  public void addAccountClientExistTest() {
    AccountRepository accountRepository = mock(AccountRepository.class);
    ClientRepository clientRepository = mock(ClientRepository.class);

    AccountService accountService =
            new AccountService(accountRepository, clientRepository);

    Account a = new Account();
    Client c = new Client();
    c.setCnp("12345");
    a.setClient(c);

    when(clientRepository.findClientByCNP(c.getCnp()))
            .thenReturn(Optional.of(c));

    accountService.addAccount(a);

    verify(accountRepository).addAccount(a);
  }
}

package tests;

import exceptions.InexistingAccountException;
import exceptions.NotEnoughMoneyException;
import model.Account;
import model.Transaction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import repositories.AccountRepository;
import repositories.TransactionRepository;
import services.TransactionService;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class ExecuteTransactionTests {

  @Test
  @DisplayName("Testing that an exception is thrown when the" +
          " source account doesn't exist.")
  public void executeTransactionSourceAccountDoesntExistTest() {
    AccountRepository accountRepository = mock(AccountRepository.class);
    TransactionRepository transactionRepository = mock(TransactionRepository.class);

    TransactionService transactionService =
            new TransactionService(transactionRepository, accountRepository);

    Transaction t = new Transaction();
    t.setAmount(100);

    Account sourceAccount = new Account();
    sourceAccount.setId(1);

    Account destinationAccount = new Account();
    destinationAccount.setId(2);

    t.setSourceAccount(sourceAccount);
    t.setDestAccount(destinationAccount);

    when(accountRepository.findAccountById(sourceAccount.getId()))
            .thenReturn(Optional.empty());

    assertThrows(InexistingAccountException.class,
            () -> transactionService.executeTransaction(t));

    verify(transactionRepository, never()).addTransaction(t);
  }

  @Test
  @DisplayName("Testing that an exception is thrown when the" +
          " source account doesn't have enough money.")
  public void executeTransactionSourceAccountDoesntHaveEnoughMoneyTest() {
    AccountRepository accountRepository = mock(AccountRepository.class);
    TransactionRepository transactionRepository = mock(TransactionRepository.class);

    TransactionService transactionService =
            new TransactionService(transactionRepository, accountRepository);

    Transaction t = new Transaction();
    t.setAmount(100);

    Account sourceAccount = new Account();
    sourceAccount.setId(1);

    Account destinationAccount = new Account();
    destinationAccount.setId(2);

    t.setSourceAccount(sourceAccount);
    t.setDestAccount(destinationAccount);

    when(accountRepository.findAccountById(sourceAccount.getId()))
            .thenReturn(Optional.of(sourceAccount));

    assertThrows(NotEnoughMoneyException.class,
            () -> transactionService.executeTransaction(t));

    verify(transactionRepository, never()).addTransaction(t);
  }

  @Test
  @DisplayName("Testing that an exception is thrown when the" +
          " destination account doesn't exist.")
  public void executeTransactionDestinationAccountDoesntExistTest() {
    AccountRepository accountRepository = mock(AccountRepository.class);
    TransactionRepository transactionRepository = mock(TransactionRepository.class);

    TransactionService transactionService =
            new TransactionService(transactionRepository, accountRepository);

    Transaction t = new Transaction();
    t.setAmount(100);

    Account sourceAccount = new Account();
    sourceAccount.setAmount(1000);
    sourceAccount.setId(1);

    Account destinationAccount = new Account();
    destinationAccount.setId(2);

    t.setSourceAccount(sourceAccount);
    t.setDestAccount(destinationAccount);

    when(accountRepository.findAccountById(sourceAccount.getId()))
            .thenReturn(Optional.of(sourceAccount));

    when(accountRepository.findAccountById(destinationAccount.getId()))
            .thenReturn(Optional.empty());

    assertThrows(InexistingAccountException.class,
            () -> transactionService.executeTransaction(t));

    verify(transactionRepository, never()).addTransaction(t);
  }

  @Test
  @DisplayName("Testing that when all the conditions are met " +
          " the transaction is done.")
  public void executeTransactionTest() {
    AccountRepository accountRepository = mock(AccountRepository.class);
    TransactionRepository transactionRepository = mock(TransactionRepository.class);

    TransactionService transactionService =
            new TransactionService(transactionRepository, accountRepository);

    Transaction t = new Transaction();
    t.setAmount(100);

    Account sourceAccount = new Account();
    sourceAccount.setAmount(1000);
    sourceAccount.setId(1);

    Account destinationAccount = new Account();
    destinationAccount.setId(2);

    t.setSourceAccount(sourceAccount);
    t.setDestAccount(destinationAccount);

    when(accountRepository.findAccountById(sourceAccount.getId()))
            .thenReturn(Optional.of(sourceAccount));

    when(accountRepository.findAccountById(destinationAccount.getId()))
            .thenReturn(Optional.of(destinationAccount));

    transactionService.executeTransaction(t);

    verify(transactionRepository, times(1)).addTransaction(t);
  }
}

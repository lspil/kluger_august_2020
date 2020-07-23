package services;

import exceptions.InexistingAccountException;
import exceptions.NotEnoughMoneyException;
import model.Account;
import model.Transaction;
import repositories.AccountRepository;
import repositories.TransactionRepository;

import java.util.Optional;

public class TransactionService {

  private TransactionRepository transactionRepository;
  private AccountRepository accountRepository;

  public TransactionService(TransactionRepository transactionRepository,
                            AccountRepository accountRepository) {
    this.transactionRepository = transactionRepository;
    this.accountRepository = accountRepository;
  }

  public void executeTransaction(Transaction t) {
    Optional<Account> sourceAccount =
            accountRepository.findAccountById(t.getSourceAccount().getId());

    Account sa = sourceAccount.orElseThrow(() -> new InexistingAccountException());

    if (sa.getAmount() < t.getAmount()) {
      throw new NotEnoughMoneyException();
    }

    Optional<Account> destAccount =
            accountRepository.findAccountById(t.getDestAccount().getId());

    destAccount.orElseThrow(() -> new InexistingAccountException());

    transactionRepository.addTransaction(t);
  }
}

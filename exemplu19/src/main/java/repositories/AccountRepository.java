package repositories;

import model.Account;

import java.util.Optional;

public interface AccountRepository {

  void addAccount(Account account);
  Optional<Account> findAccountById(int id);

  static AccountRepository getInstance() {
    return new MySQLAccountRepository();
  }
}

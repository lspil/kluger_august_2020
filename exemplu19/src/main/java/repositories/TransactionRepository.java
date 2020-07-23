package repositories;

import model.Transaction;

public interface TransactionRepository {

  void addTransaction(Transaction transaction);

  static TransactionRepository getInstance() {
    return new MySQLTransactionRepository();
  }
}

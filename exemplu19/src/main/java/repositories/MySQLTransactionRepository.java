package repositories;

import exceptions.DBConnectionException;
import managers.DBConnectionManager;
import model.Transaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySQLTransactionRepository implements TransactionRepository {

  public void addTransaction(Transaction transaction) {
    String sql = "INSERT INTO transaction VALUES (NULL, ?, ?, ?)";

    Connection con = DBConnectionManager.getInstance().getConnection();

    try {
      PreparedStatement s = con.prepareStatement(sql);
      s.setDouble(1, transaction.getAmount());
      s.setInt(2, transaction.getSourceAccount().getId());
      s.setInt(3, transaction.getDestAccount().getId());
      s.executeUpdate();
    } catch (SQLException e) {
      throw new DBConnectionException();
    }
  }
}

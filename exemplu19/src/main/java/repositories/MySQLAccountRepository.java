package repositories;

import exceptions.DBConnectionException;
import managers.DBConnectionManager;
import model.Account;
import model.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class MySQLAccountRepository implements AccountRepository {

  public void addAccount(Account account) {
    String sql = "INSERT INTO account VALUES (NULL, ?, ?)";

    Connection con = DBConnectionManager.getInstance().getConnection();
    try {
      PreparedStatement s = con.prepareStatement(sql);
      s.setDouble(1, account.getAmount());
      s.setInt(2, account.getClient().getId());
      s.executeUpdate();
    } catch (SQLException e) {
      throw new DBConnectionException();
    }
  }

  public Optional<Account> findAccountById(int id) {
    String sql = "SELECT * FROM account WHERE id = ?";

    Connection con = DBConnectionManager.getInstance().getConnection();

    try {
      PreparedStatement s = con.prepareStatement(sql);
      s.setInt(1, id);

      ResultSet result = s.executeQuery();

      if (result.next()) {
        Account account = new Account();
        account.setId(result.getInt("id"));
        account.setAmount(result.getDouble("amount"));

        Client c = new Client();
        c.setId(result.getInt("client"));

        account.setClient(c);

        return Optional.of(account);
      }
    } catch (SQLException e) {
      throw new DBConnectionException();
    }

    return Optional.empty();
  }
}

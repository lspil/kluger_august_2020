package managers;

import exceptions.DBConnectionException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionManager {
  private static DBConnectionManager INSTANCE;

  private Connection connection;

  private DBConnectionManager() {
    String url = "jdbc:mysql://localhost/curs";
    String username = "root";
    String password = "";

    try {
      connection = DriverManager.getConnection(url, username, password);
    } catch (SQLException e) {
      throw new DBConnectionException();
    }
  }

  public static DBConnectionManager getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new DBConnectionManager();
    }
    return INSTANCE;
  }

  public Connection getConnection() {
    return connection;
  }
}

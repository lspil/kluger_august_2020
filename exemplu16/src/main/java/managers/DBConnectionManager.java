package managers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionManager {
  private static DBConnectionManager INSTANCE;

  private Connection con;

  private DBConnectionManager() {
    try {
      String url = "jdbc:mysql://localhost/curs";
      String username = "root";
      String password = "";
      this.con = DriverManager.getConnection(url, username, password);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public static DBConnectionManager getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new DBConnectionManager();
    }
    return INSTANCE;
  }

  public Connection getCon() {
    return con;
  }
}

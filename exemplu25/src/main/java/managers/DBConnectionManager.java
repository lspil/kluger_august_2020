package managers;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Component
public class DBConnectionManager {

  private Connection connection;

  public DBConnectionManager() {
    String url = "jdbc:mysql://localhost/curs";
    String username = "root";
    String password = "";

    try {
      connection = DriverManager.getConnection(url, username, password);
    } catch (SQLException e) {
      throw new RuntimeException();
    }
  }

  public Connection getConnection() {
    return connection;
  }

  @PreDestroy
  public void close() throws SQLException {
    connection.close();
  }
}

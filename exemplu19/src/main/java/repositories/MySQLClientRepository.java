package repositories;

import exceptions.DBConnectionException;
import managers.DBConnectionManager;
import model.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class MySQLClientRepository implements ClientRepository {

  public void addClient(Client client) {
    String sql = "INSERT INTO client VALUES (NULL, ?, ?)";

    Connection connection = DBConnectionManager.getInstance().getConnection();
    try {
      PreparedStatement s = connection.prepareStatement(sql);
      s.setString(1, client.getName());
      s.setString(2, client.getCnp());
      s.executeUpdate();
    } catch (SQLException e) {
      throw new DBConnectionException();
    }
  }

  public Optional<Client> findClientByCNP(String cnp) {
    String sql = "SELECT * FROM client WHERE cnp = ?";

    Connection connection = DBConnectionManager.getInstance().getConnection();
    try {
      PreparedStatement s = connection.prepareStatement(sql);
      s.setString(1, cnp);

      ResultSet result = s.executeQuery();

      if (result.next()) {
        Client client = new Client();
        client.setId(result.getInt("id"));
        client.setName(result.getString("name"));
        client.setCnp(result.getString("cnp"));
        return Optional.of(client);
      }
    } catch (SQLException e) {
      throw new DBConnectionException();
    }

    return Optional.empty();
  }
}

package repositories;

import managers.DBConnectionManager;
import model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLProductRepository implements ProductRepository {

  public void addProduct(Product p) {
    String sql = "INSERT INTO product VALUES (NULL, ?, ?)";

    try {
      Connection con = DBConnectionManager.getInstance().getCon();
      PreparedStatement statement = con.prepareStatement(sql);
      statement.setString(1, p.getName());
      statement.setDouble(2, p.getPrice());
      statement.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public List<Product> getAllProducts() {
    List<Product> products = new ArrayList<>();
    String sql = "SELECT * FROM product";

    try {
      Connection con = DBConnectionManager.getInstance().getCon();
      PreparedStatement statement = con.prepareStatement(sql);
      ResultSet result = statement.executeQuery();

      while (result.next()) {
        int id = result.getInt("id");
        String name = result.getString("name");
        double price = result.getDouble("price");

        Product p = new Product();
        p.setId(id);
        p.setName(name);
        p.setPrice(price);

        products.add(p);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }

    return products;
  }

  /**
   * executeUpdate() -> INSERT, UPDATE, DELETE
   * executeQuery() -> SELECT
   * execute() -> ORICE ALT QUERY
   */
}

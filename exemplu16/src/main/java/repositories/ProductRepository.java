package repositories;

import model.Product;

import java.util.List;

public interface ProductRepository {

  void addProduct(Product p);
  List<Product> getAllProducts();

  public static ProductRepository getInstance() {
    return new MySQLProductRepository();
  }
}

package repository;

import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductRepository {

  private List<Product> products = new ArrayList<>();

  public List<Product> getAllProducts() {
    return products;
  }

  public void addProduct(Product p) {
    products.add(p);
  }

  public Optional<Product> getProductByName(String name) {
    return products.stream()
            .filter(p -> p.getName().equals(name))
            .findFirst();
  }
}

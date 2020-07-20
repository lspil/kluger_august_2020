package repository;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

  List<Product> products = new ArrayList<>(); // simulam in ex nostru baza de date

  public void addProduct(Product p) {
    products.add(p);
  }

  public List<Product> getAllProducts() {
    return products;
  }

  public void removeProduct(Product p) {
    products.remove(p);
  }
}

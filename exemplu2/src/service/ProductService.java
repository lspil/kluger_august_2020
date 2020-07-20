package service;

import model.Product;
import repository.ProductRepository;

import java.util.List;

public class ProductService {

  private ProductRepository productRepository = new ProductRepository();

  public void addProduct(Product p) {
    productRepository.addProduct(p);
  }

  public Product findProduct(String name) {
    List<Product> products = productRepository.getAllProducts();

    for (Product p : products) {
      if (p.getName().equals(name)) {
        return p;
      }
    }

    return null;
  }

  public void sellProduct(Product p) {
    productRepository.removeProduct(p);
  }
}

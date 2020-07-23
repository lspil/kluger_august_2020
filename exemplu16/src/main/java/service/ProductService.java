package service;

import model.Product;
import repositories.ProductRepository;

import java.util.List;

public class ProductService {

  private ProductRepository productRepository = ProductRepository.getInstance();

  public void addProduct(Product product) {
    productRepository.addProduct(product);
  }

  public List<Product> getAllProducts() {
    return productRepository.getAllProducts();
  }
}

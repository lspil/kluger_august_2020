package service;

import model.Product;
import repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProductService {

  private ProductRepository productRepository;

  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public List<Product> getProductsWithPriceGreaterThan(double price) {
    List<Product> products = productRepository.getAllProducts();
    return products.stream()
            .filter(p -> p.getPrice() > price)
            .collect(Collectors.toList());
  }

  public void addProduct(Product product) {
    Optional<Product> p =
            productRepository.getProductByName(product.getName());

    if (p.isEmpty()) {
      productRepository.addProduct(product);
    } else {
      throw new RuntimeException();
    }
  }
}

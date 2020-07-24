package service;

import annotations.Seteaza;
import repositories.ProductRepository;

public class ProductService {

  @Seteaza
  private ProductRepository productRepository;

  public void addProduct() {
    productRepository.addProduct();
  }
}

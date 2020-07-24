package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import repositories.OracleProductRepository;
import repositories.ProductRepository;

@Component
public class ProductService {

  @Autowired
  @Qualifier("mysql")
  private ProductRepository productRepository;

  public void addProduct() {
    productRepository.addProduct();
  }
}

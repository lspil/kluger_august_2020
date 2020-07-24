package repositories;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("mysql")
public class MySQLProductRepository implements ProductRepository {

  public void addProduct() {
    System.out.println("Product added...");
  }
}

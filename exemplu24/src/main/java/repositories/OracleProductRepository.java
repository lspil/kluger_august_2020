package repositories;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("oracle")
public class OracleProductRepository implements ProductRepository {

  public void addProduct() {
    System.out.println("Product added...");
  }
}

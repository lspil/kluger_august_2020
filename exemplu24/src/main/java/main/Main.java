package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.ProductService;

public class Main {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(ProjectConfig.class);


    ProductService service = context.getBean(ProductService.class);

    service.addProduct();
  }
}

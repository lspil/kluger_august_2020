package main;

import model.Product;
import service.ProductService;

public class Main {

  public static void main(String[] args) {
    ProductService productService = new ProductService();
    productService.getAllProducts()
            .forEach(p -> System.out.println(p.getId() + " " +p.getName() + " " + p.getPrice()));

//    Product p = new Product();
//    p.setName("Beer");
//    p.setPrice(5);
//
//    productService.addProduct(p);
  }
}

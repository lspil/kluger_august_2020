package main;

import model.Product;

public class Main {

  public static void main(String[] args) {
    Product p = new Product();

    p.setName("Ciocolata");

    String name = p.getName();

    System.out.println(name);
  }
}

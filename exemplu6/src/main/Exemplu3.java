package main;

public class Exemplu3 {

  public static void main(String[] args) {

  }

  static void n() throws E1 {
    m();
  }

  static void m() throws E1 { // propagam exceptia
    // logica
    throw new E1();
    // logica
  }
}

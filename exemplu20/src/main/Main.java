package main;

public class Main {

  public static void main(String[] args) {
    A a = new B();


    // clasa A -> public
    // clasa B -> neaccesibila

    a.m(); // -> m() B
  }
}

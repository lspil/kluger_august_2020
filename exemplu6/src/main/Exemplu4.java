package main;

public class Exemplu4 {

  public static void main(String[] args) {

    try {
      // instructiuni ce pot arunca exceptii
      int x = 10 / 0;
      System.out.println(x); // 2
    } finally {
      // se executa chiar si atunci cand a aparut o exceptie
      System.out.println(":)"); // :)
    }

  }
}

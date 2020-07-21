package main;

public class Exemplu6 {

  public static void main(String[] args) {
    try {
      int x = 10 / 0;
      System.out.println(x);
    } catch (Exception e) {
      System.out.println(":(");
    }
  }
}

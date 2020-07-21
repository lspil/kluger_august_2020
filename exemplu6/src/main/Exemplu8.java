package main;

public class Exemplu8 {

  public static void main(String[] args) {
    try {
      int x = 10 / 0;
      // aici nu se mai ajunge
      System.out.println(x);
    } catch (ArithmeticException e) {
      System.out.println(":(");
    } catch (IndexOutOfBoundsException e) {
      System.out.println(":|");
    } catch (Exception e) {
      System.out.println(":)");
    } finally {
      System.out.println("END");
    }
  }
}

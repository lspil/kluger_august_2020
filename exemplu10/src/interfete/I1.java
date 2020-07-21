package interfete;

// SOLID

/**
 *    Set  <-  SortedSet
 */
public interface I1 extends I2, I3 {

  void m();

  default void n() { // din Java 8
    System.out.println(":)");
  }

  private static void q() { // din Java 9

  }
}

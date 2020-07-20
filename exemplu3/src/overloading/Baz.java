package overloading;

public class Baz {

  /**
   * numarul parametrilor
   * tipul macar a unuia dintre parametri sa fie diferiti
   * ordinea paramterilor
   */

  void m(int y, short x) {
    m(x, y);
  }

  static void m(short y, int x) {

  }
}

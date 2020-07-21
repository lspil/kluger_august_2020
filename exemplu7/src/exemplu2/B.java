package exemplu2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class B extends A {

  String x; // hiding fields
  int y;

  void n() {
    System.out.println("N");
  }

  // suprascriere - overriding

  public void m() {
    System.out.println("B");
  }

  RuntimeException q() {
    return null;
  }

  /**
   * reguli pentru suprascriere
   * 1. acelasi identificator si aceeasi parametri
   * 2. tipul returnat - daca este primitiva sau void trebuie sa avem acelasi tip returnat.
   *    daca este obiect, atunci tipul trebuie sa fie covariant.
   * 3. metoda care suprascrie trebuie sa aiba un mod de acces cel putin la fel de public
   * 4. Metoda care suprascrie nu poate propaga mai multe exceptii checked decat cea pe care
   * o suprascrie.
   */
}

package seturi;

import java.util.HashSet;
import java.util.Set;

public class Exemplu1 {

  public static void main(String[] args) {
    /*
    Seturi - Colectii de elemente care:
      - Nu accepta duplicat
      - Nu au o ordine si nu au elementele indexate

    Set<E>

      HashSet<E>

        hash code:
          i1 == i2  => hc(i1) == hc(i2)

          hc(i1) == h2(i2) NE i1 == i2
     */

    Set<Integer> set1 = new HashSet<>();
    set1.add(112);
    set1.add(45);
    set1.add(1005);
    set1.add(85);
    set1.add(10);

    for (Integer i : set1) {
      System.out.println(i); // 1 4 8 10
    }
  }
}

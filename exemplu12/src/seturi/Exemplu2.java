package seturi;

import java.util.Set;
import java.util.TreeSet;

public class Exemplu2 {

  public static void main(String[] args) {
    /*
    SortedSet<E>  -> Set<E>

      TreeSet<E> -> sorteaza valorile din colectie

    NavigableSet<E> -> Set<E>

      LinkedHashSet<E>
     */

    Set<Integer> set1 = new TreeSet<>();
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

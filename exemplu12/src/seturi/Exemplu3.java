package seturi;

import java.util.Set;
import java.util.TreeSet;

public class Exemplu3 {

  public static void main(String[] args) {
    // Comparable<C> -> regula de comparare definita chiar de catre obiectul comparat insusi (Client)
    // Comparator<C> -> regula de comparare definita de catre un alt obiect decat cel comparat.
    Client c1 = new Client("B", 30);
    Client c2 = new Client("C", 25);
    Client c3 = new Client("A", 35);
    Client c4 = new Client("D", 38);

    //ComparatorClientDupaNume x = new ComparatorClientDupaNume();
    ComparatorClientDupaVarsta x = new ComparatorClientDupaVarsta();

    Set<Client> set = new TreeSet<>(x);
    set.add(c1);
    set.add(c2);
    set.add(c3);
    set.add(c4);

    for (Client c : set) {
      System.out.println(c.getNume() + " " + c.getVarsta());
    }
  }
}

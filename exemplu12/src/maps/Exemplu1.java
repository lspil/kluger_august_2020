package maps;

import java.util.*;

public class Exemplu1 {

  public static void main(String[] args) {
    /**
     * Colectii de perechi cheie-valoare (dictionare)
     *
     * Map<K,V>
     *   -> cheile sunt unice
     *
     *    HashMap<K,V>  --->  foloseste hash codul cheilor
     *                         pentru a cauta in colectie.
     *                         Elementele nu sunt ordonate.
     *    LinkedHashMap<K, V>  ---> Ordoneaza elementele in ordinea adaugarii.
     *    TreeMap<K,V>  ---> Sorteaza dupa chei
     */

    Map<Integer, String> map = new TreeMap<>();

    map.put(10, "A");
    map.put(400, "C");
    map.put(123, "F");

    Set<Integer> keys = map.keySet();
    for (Integer k : keys) {
      System.out.println(k + " " + map.get(k));
    }
  }
}

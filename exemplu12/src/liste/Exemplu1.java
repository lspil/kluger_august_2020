package liste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Exemplu1 {

  public static void main(String[] args) {
    /*
    Lista este o colectie de elemente care:
      - admite duplicat
      - are elementele indexate (identifica cu o valoare numerica oricare dintre elementele sale)
      - elementele sunt intotdeauna intr-o ordine bine definita

      1 3 5 2 4 3 2 => ordonat

      1 2 2 3 3 4 5 => sortat

      List<E>  ---> interfata (contract)
        ArrayList
        LinkedList
     */

    ArrayList<Integer> list1 = new ArrayList<>();
//    list1.add(10);
//    list1.remove(10);

    List<Integer> list2 = new ArrayList<>(); // almost anytime
      /*
        -   0 1 2 3 4 5 6 7 8 9 10
        -  [2,4,5,7,8,9,7,6,4,3,2]
        -  v[5] -> Accesul la valori este foarte putin complex O(1)
        -  [1,2,3,4,5]  -> [1,2,3,4,5,6]
       */

    List<Integer> list3 = new LinkedList<>();
      /*
        -  E1 ... E2 ... E3 ... Ex ... E4 ...
            E2   E1 E3  E2 Ex  E3 E4  Ex

        - Adaugarea unui element sa fie foarte puntin complexa O(1)
        - Accesul la un element -> O(n) -> Mult mai complexa decat pt ArrayList
       */

    Collections.sort(list3);
    Collections.min(list1);
  }
}

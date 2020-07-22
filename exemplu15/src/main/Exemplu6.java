package main;

import java.util.Optional;

public class Exemplu6 {

  public static void main(String[] args) {
    Optional<Integer> o1 = Optional.empty();
    Optional<Integer> o2 = Optional.of(10);

    boolean b1 = o2.isPresent(); // false daca este empty, true daca nu este empty
    Integer v1 = o2.get(); // arunca exceptie daca o2 este empty

    o2.ifPresent(a -> System.out.println(a));

    Integer v2 = o2.orElse(-1);
    Integer v3 = o2.orElseThrow(() -> new RuntimeException());
  }
}

package main;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Exemplu2 {

  public static void main(String[] args) {
    List<String> list = Arrays.asList("ABC", "XYZ", "AAAA", "QWERTY", "DEDEDEDE");

    /**
     * "AAAA", "QWERTY", "DEDEDEDE"
     * 4 + 6 + 8 = 18
     */

    Optional<Integer> res =
      list.stream()
          .map(x -> x.length())
          .filter(x -> x % 2 == 0)
          .reduce((x,y) -> x + y);

    res.ifPresent(x -> System.out.println(x));
  }

  public static Optional<Integer> m() {
    return Optional.empty();
  }
}

package main;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exemplu5 {

  public static void main(String[] args) {
    Map<String, Integer> map = Map.of(
                                "A", 2,
                                "B", 4,
                                "D", 8);

    List<Integer> res =
      map.keySet().stream()
              .map(k -> map.get(k))
              .sorted()
              .collect(Collectors.toList());

    System.out.println(res);
  }
}

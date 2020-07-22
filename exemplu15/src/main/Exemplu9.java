package main;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exemplu9 {

  public static void main(String[] args) {
    List<String> list =
            Arrays.asList("AA", "AAA", "VV", "BB", "AAAA", "AAAAA", "BBBB");

    /*
    2   6
    3   3
    4   8
    5   5
     */

    Map<Integer, Integer> res =
      list.stream()
              .collect(Collectors.groupingBy(s -> s.length(),
                          Collectors.mapping(s -> s.length(),
                             Collectors.reducing(0, (a,b) -> a + b)))); // downstreaming

    System.out.println(res);
  }
}

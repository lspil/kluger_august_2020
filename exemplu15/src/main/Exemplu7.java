package main;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exemplu7 {

  public static void main(String[] args) {
    List<String> list =
            Arrays.asList("AA", "AAA", "VV", "BB", "AAAA", "AAAAA", "BBBB");

    /*
    2   ["AA", "VV", "BB"]
    3   ["AAA"]
    4   ["AAAA", "BBBB"]
    5   ["AAAAA"]
     */

    Map<Integer, List<String>> res =
      list.stream()
              .collect(Collectors.groupingBy(s -> s.length()));

    System.out.println(res);
  }
}

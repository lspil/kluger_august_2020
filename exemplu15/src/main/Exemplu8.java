package main;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exemplu8 {

  public static void main(String[] args) {
    List<String> list =
            Arrays.asList("AA", "AAA", "VV", "BB", "AAAA", "AAAAA", "BBBB");

    /*
    2   "AAVVBB"
    3   "AAA"
    4   "AAAABBBB"
    5   "AAAAA"
     */

    Map<Integer, String> res =
      list.stream()
              .collect(Collectors.groupingBy(s -> s.length(),
                          Collectors.joining("-"))); // downstreaming

    System.out.println(res);
  }
}

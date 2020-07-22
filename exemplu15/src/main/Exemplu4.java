package main;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Exemplu4 {

  public static void main(String[] args) {
    List<String> list = Arrays.asList("ABC", "XYZ", "AAAA", "QWERTY", "DEDEDEDE");

    Set<Integer> res =
      list.stream()
              .map(s -> s.length())
              .filter(x -> x % 2 != 0)
              .collect(Collectors.toSet());

    System.out.println(res);
  }
}

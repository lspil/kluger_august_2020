package main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplu3 {

  public static void main(String[] args) {
    List<String> list = Arrays.asList("ABC", "XYZ", "AAAA", "QWERTY", "DEDEDEDE");

    List<Integer> res =
      list.stream()
              .map(s -> s.length())
              .distinct()
              .collect(Collectors.toList());

    System.out.println(res);
  }
}

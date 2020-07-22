package main;

import java.util.Arrays;
import java.util.List;

public class Exemplu1 {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(3,4,6,7,2,3,4,5,4,3);

    list.stream() // sursa
        .filter(x -> x % 2 != 0) // OI 1
        .distinct()   // OI 2
        .forEach(x -> System.out.println(x));    // OT


  }
}

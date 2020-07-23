package services;

import java.util.List;

public class SumNumberService {

  public int sumOddNumbers(List<Integer> list) {
    int sum = 0;

    for (Integer i : list) {
      if (i % 2 != 0) {
        sum = sum + i;
      }
    }

    return sum;
  }
}

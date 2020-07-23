package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import services.SumNumberService;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumNumberServiceTests {

  @Test
  @DisplayName("Testing that the sum of odd numbers is correctly calculated.")
  public void sumOddNumbersTest() {
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);

    SumNumberService service = new SumNumberService();

    int sum = service.sumOddNumbers(list);

    assertEquals(16, sum);
  }

  @Test
  @DisplayName("Testing that when the list doesn't contain odd numbers" +
          " the sum of odd numbers is correctly calculated.")
  public void sumOddNumbersNoOddNumbersTest() {
    List<Integer> list = Arrays.asList(2,4,6);

    SumNumberService service = new SumNumberService();

    int sum = service.sumOddNumbers(list);

    assertEquals(0, sum);
  }

  @Test
  @DisplayName("Testing that when the list contains no number at all" +
          " the result is 0.")
  public void sumOddNumbersEmptyListTest() {
    List<Integer> list = Arrays.asList();

    SumNumberService service = new SumNumberService();

    int sum = service.sumOddNumbers(list);

    assertEquals(0, sum);
  }
}

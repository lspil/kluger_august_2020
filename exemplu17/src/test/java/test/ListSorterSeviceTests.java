package test;

import org.junit.jupiter.api.Test;
import services.ListSorterService;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class ListSorterSeviceTests {

  @Test
  public void testArraySort() {
    ListSorterService service = new ListSorterService();

    int input[] = {1,4,3,2};

    service.sort(input);

    int expectedResult[] = {1,2,3,4};

    assertArrayEquals(expectedResult, input);
  }
}

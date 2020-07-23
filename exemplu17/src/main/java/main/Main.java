package main;

import services.ListSorterService;

public class Main {

  public static void main(String[] args) {
    ListSorterService sorterService = new ListSorterService();

    int [] v = {5,3,4,7,8,1,3,2,4,5};

    sorterService.sort(v);

    for (int i : v) {
      System.out.println(i);
    }
  }
}

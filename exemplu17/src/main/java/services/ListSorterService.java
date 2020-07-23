package services;

public class ListSorterService {

  public int[] sort(int [] input) {
    for (int i=0; i<input.length-1; i++) {
      for (int j=i+1; j<input.length; j++) {
        if (input[i] > input[j]) {
          int aux = input[i];
          input[i] = input[j];
          input[j] = aux;
        }
      }
    }
    return input;
  }
}

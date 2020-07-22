package seturi;

import java.util.Comparator;

public class ComparatorClientDupaVarsta implements Comparator<Client> {

  @Override
  public int compare(Client c1, Client c2) {
    if (c1.getVarsta() < c2.getVarsta()) {
      return -1;
    }

    if (c1.getVarsta() > c2.getVarsta()) {
      return 1;
    }

    return 0;
  }
}

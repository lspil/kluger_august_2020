package seturi;

import java.util.Comparator;

public class ComparatorClientDupaNume implements Comparator<Client> {

  @Override
  public int compare(Client c1, Client c2) {
    return c1.getNume().compareTo(c2.getNume());
  }
}

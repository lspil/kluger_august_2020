package seturi;

import java.util.Objects;

public class Client implements Comparable<Client> {

  private String nume;
  private int varsta;

  public Client(String nume, int varsta) {
    this.nume = nume;
    this.varsta = varsta;
  }

  public String getNume() {
    return nume;
  }

  public void setNume(String nume) {
    this.nume = nume;
  }

  public int getVarsta() {
    return varsta;
  }

  public void setVarsta(int varsta) {
    this.varsta = varsta;
  }

  @Override
  public int compareTo(Client c) {
    // this < c  (< 0)
    // this == c (0)
    // this > c (> 0)
    if (this.getVarsta() < c.getVarsta()) {
      return -1;
    }

    if (this.getVarsta() > c.getVarsta()) {
      return 1;
    }

    return this.getNume().compareTo(c.getNume());
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Client client = (Client) o;
    return Objects.equals(nume, client.nume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nume);
  }
}

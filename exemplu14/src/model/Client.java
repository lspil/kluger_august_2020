package model;

import java.util.Objects;

public class Client {

  private String nume;

  public String getNume() {
    return nume;
  }

  public void setNume(String nume) {
    this.nume = nume;
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

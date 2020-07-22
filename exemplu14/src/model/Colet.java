package model;

import model.enums.StatusLivrare;

public class Colet extends Livrare {

  private double greutate;

  public Colet() {
  }

  public Colet(String cod, String destinatar, StatusLivrare status, Client client, double greutate) {
    super(cod, destinatar, status, client);
    this.greutate = greutate;
  }

  public double getGreutate() {
    return greutate;
  }

  public void setGreutate(double greutate) {
    this.greutate = greutate;
  }
}

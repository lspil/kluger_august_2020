package model;

public abstract class Card {

  protected String numar;
  protected double sold;

  public String getNumar() {
    return numar;
  }

  public void setNumar(String numar) {
    this.numar = numar;
  }

  public double getSold() {
    return sold;
  }

  public void setSold(double sold) {
    this.sold = sold;
  }
}

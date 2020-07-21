package model;

import java.util.List;

public class Client {

  private String nume;
  private String cnp;
  private List<Card> carduri; // clientul are carduri

  public Client() {
  }

  public Client(String nume, String cnp) {
    this.nume = nume;
    this.cnp = cnp;
  }

  public String getNume() {
    return nume;
  }

  public void setNume(String nume) {
    this.nume = nume;
  }

  public String getCnp() {
    return cnp;
  }

  public void setCnp(String cnp) {
    this.cnp = cnp;
  }

  public List<Card> getCarduri() {
    return carduri;
  }

  public void setCarduri(List<Card> carduri) {
    this.carduri = carduri;
  }
}

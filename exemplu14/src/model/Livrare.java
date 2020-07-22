package model;

import model.enums.StatusLivrare;

public abstract class Livrare {

  protected String cod;
  protected String destinatar;
  protected StatusLivrare status;
  protected Client client;

  public Livrare() {
  }

  public Livrare(String cod, String destinatar, StatusLivrare status, Client client) {
    this.cod = cod;
    this.destinatar = destinatar;
    this.status = status;
    this.client = client;
  }

  public String getCod() {
    return cod;
  }

  public void setCod(String cod) {
    this.cod = cod;
  }

  public String getDestinatar() {
    return destinatar;
  }

  public void setDestinatar(String destinatar) {
    this.destinatar = destinatar;
  }

  public StatusLivrare getStatus() {
    return status;
  }

  public void setStatus(StatusLivrare status) {
    this.status = status;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }
}

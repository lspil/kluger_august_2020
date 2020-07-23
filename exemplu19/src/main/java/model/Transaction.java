package model;

public class Transaction {

  private int id;
  private double amount;
  private Account sourceAccount;
  private Account destAccount;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public Account getSourceAccount() {
    return sourceAccount;
  }

  public void setSourceAccount(Account sourceAccount) {
    this.sourceAccount = sourceAccount;
  }

  public Account getDestAccount() {
    return destAccount;
  }

  public void setDestAccount(Account destAccount) {
    this.destAccount = destAccount;
  }
}

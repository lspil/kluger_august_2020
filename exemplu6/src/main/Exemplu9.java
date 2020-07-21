package main;

public class Exemplu9 {

  public static void main(String[] args) {
    try {
      // logica de retragere bani din cont
    } catch (TooManyTransactionsPerDayException e) {
      // tratezi cazul prea multe tranzactii
    } catch (NotEnoughMoneyException e) {
      // tratezi cazul nu are bani
    }
  }
}

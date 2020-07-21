package main;

public class Exemplu10 {

  public static void main(String[] args) {
    try {
      // logica de retragere bani din cont
    } catch (NotEnoughMoneyException | TooManyTransactionsPerDayException e) {

    } catch (Exception e) {

    }
  }

  public void m() throws TooManyTransactionsPerDayException,
          NotEnoughMoneyException {

  }

  public void n() throws ArithmeticException {

  }
}

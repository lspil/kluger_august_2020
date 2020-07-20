package constructori;

public class Invoice {

  int number;

  Invoice() {
    this(10);
  }

  Invoice(int number) {
    this.number = number;
  }
}

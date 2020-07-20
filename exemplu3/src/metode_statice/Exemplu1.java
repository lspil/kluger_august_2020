package metode_statice;

public class Exemplu1 {

  public static void main(String[] args) {
    Baz b1 = new Baz();

    b1.m();

    Baz b2 = new Baz();

    b2.m();

    Baz.q();
  }
}

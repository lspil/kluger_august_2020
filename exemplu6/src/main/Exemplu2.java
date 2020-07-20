package main;

public class Exemplu2 {

  public static void main(String[] args) {
    /**
     * Exceptii de baza:
     *    - Exception ->  Clasa parinte ce reprezinta toate exceptiile
     *    - RuntimeException -> Clasa ce reprezinta toate exceptiile de runtime
     *    - NullPointerException -> apare cand ne referim la un atribut sau comportament fara sa avem o instanta
     *    - ArithmeticException -> imparti un numar intreg la 0
     *    - IndexOutOfBoundsException
     *          StringIndexOutOfBoundsException, ArrayIndexOutOfBoundsException
     *    - FileNotFoundException, IOException
     *    - InterruptedException
     */

//    Foo foo1 = new Foo();
//
//    foo1 = null;
//
//    foo1.n = 10; // NullPointerException

//    int x = 10 / 0;

    String s = "HELLO";
    System.out.println(s.charAt(5));

  }
}

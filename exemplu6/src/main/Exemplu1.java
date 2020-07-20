package main;

public class Exemplu1 {

  public static void main(String[] args) {
    /**
     *  Exceptii -> situatii care apar la executie si care sunt diferite
     *  de flow-ul normal de executie
     *
     *  Clasificare:
     *    -> de runtime (unchecked) ---> RuntimeException
     *    -> checked (by compiler)
     *
     *    1. Cum declaram o exceptie
     *    2. Cum semnalam o situatie exceptionala  -> throw
     *    3. Exceptii de baza (NullPointerException, ArithmeticException...)
     *    4. Tratarea exceptiilor (try-catch-finally / throws)
     *    5. Best practices
     *
     *    Exception (checked)
     *
     *            E1  E2  E3  E4   <----- compilatorul verifica faptul ca sunt tratate
     *
     *       RuntimeException
     *
     *      R1   R2   R3   R4  <------ compilatorul nu verifica nimic!
     */
  }

  public static void m() {
    throw new R1();
  }
}

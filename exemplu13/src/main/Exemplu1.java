package main;

public class Exemplu1 {

  public static void main(String[] args) {
    // f(a,b) =  a + b
    Functie f1 = (a,b) -> a+b;

    Predicat p1 = x -> x % 2 == 0; // Este x un numar par?

    boolean b1 = p1.test(10); // true
    boolean b2 = p1.test(30); // true
    boolean b3 = p1.test(15); // false

    int res1 = f1.calculeaza(10,30); // 40
  }
}

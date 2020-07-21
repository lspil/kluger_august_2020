package exemplu1;

public class Exemplu1 {

  public static void main(String[] args) {
    A a1 = new A();
    B b1 = new B();

    A a2 = new B();
      /*
        atribute?   x, y
       */

    a2.x = 10;

    B b2 = (B) a2;

    b2.x = 10;
    b2.y = 20;
  }
}

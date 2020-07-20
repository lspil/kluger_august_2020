package declarari;

public class Exemplu5 {

  public static void main(String[] args) {
    Foo f1 = new Foo();
    Foo f2 = new Foo();
    a(f1);
    f1 = null;
    b(f1);
  }

  static void a(Foo foo) {
    foo = null;
    b(foo);
  }

  static void b(Foo foo) {

  }
}

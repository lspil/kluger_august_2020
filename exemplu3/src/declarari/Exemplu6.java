package declarari;

public class Exemplu6 {

  public static void main(String[] args) {
    int x = 10;

    Foo foo = new Foo();
    foo.x = 20;

    a(x);
    b(foo);

    System.out.println(x); // 10
    System.out.println(foo.x); // 100
  }

  static void a(int x) {
    x = 50;
  }

  static void b(Foo f) {
    f.x = 100;
  }
}

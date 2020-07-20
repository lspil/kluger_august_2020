package declarari;

public class Exemplu4 {

  public static void main(String[] args) {
    Foo f1 = new Foo();
    Foo f2 = new Foo();
    Foo f3 = new Foo();
    Foo f4 = new Foo();
    Foo f5 = new Foo();

    f1.x = 10;
    f2.x = 20;

    Foo.y = 10; // f1.y = 10;  f2.y = 20;
    Foo.y = 20;

    System.out.println(f1.x); // 10
    System.out.println(Foo.y); // 20
    System.out.println(f2.x); // 20
    System.out.println(Foo.y); // 20
  }
}

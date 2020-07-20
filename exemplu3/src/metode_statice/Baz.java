package metode_statice;

public class Baz {

  int x;

  void m() {
    this.x = 10; // this este chiar instanta care "se comporta"
    // "se comporta" === "cea pentru care am apelat metoda"
    System.out.println(this.x);
    this.n();
  }

  void n() {

  }

  static void q() {

  }

}

package exemplu1;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Exemplu1 {

  /**
   * PrintStream    (System.out)
   * PrintWriter
   * BufferedWriter   (exceptii checked)
   * ObjectOutputStream ( trimitem instante de obiect )
   */
  public static void main(String[] args) {
    // IOException  <-  FileNotFoundException

    try {
      PrintStream out = new PrintStream("test1.txt");
      out.println("Hello World!");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

  }
}

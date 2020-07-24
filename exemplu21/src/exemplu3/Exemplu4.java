package exemplu3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exemplu4 {

  public static void main(String[] args) {
    // Path (interface) -> ne referim la un fisier
    // Paths (class) -> cream referinta unui fisier
    // Files (class) -> operatii cu fisiere
    // NIO

    // File (legacy)
    Path p1 = Paths.get("test1.txt");

    try {
      Files.lines(p1)
              .filter(s -> s.length() % 2 == 0)
              .forEach(s -> System.out.println(s));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

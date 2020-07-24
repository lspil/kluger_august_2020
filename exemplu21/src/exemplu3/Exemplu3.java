package exemplu3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exemplu3 {

  public static void main(String[] args) {
    // Path (interface) -> ne referim la un fisier
    // Paths (class) -> cream referinta unui fisier
    // Files (class) -> operatii cu fisiere
    // NIO

    // File (legacy)
    Path p1 = Paths.get("test1.txt");

    try {
      List<String> list = Files.readAllLines(p1);
      list.forEach(x -> System.out.println(x));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

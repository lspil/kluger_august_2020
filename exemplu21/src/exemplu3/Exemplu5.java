package exemplu3;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplu5 {

  public static void main(String[] args) {
    Path p = Paths.get("test1.txt");

    try {
      BufferedReader in = Files.newBufferedReader(p);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

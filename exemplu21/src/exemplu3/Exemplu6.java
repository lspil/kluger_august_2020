package exemplu3;

import java.io.File;
import java.nio.file.Path;

public class Exemplu6 {

  public static void main(String[] args) {
    File file = new File("test1.txt");

    Path p = file.toPath();
  }
}

package exemplu2;

import java.io.*;

public class Exemplu2 {

  /**
   * BufferedReader
   * ObjectInputStream
   */
  public static void main(String[] args) {
    // FileReader (chars),  InputStreamReader (bytes)

    try {
      BufferedReader in = new BufferedReader(
              new InputStreamReader(
                      new FileInputStream("test1.txt")
              )
      );

      String line;

      while((line = in.readLine()) != null) {
        System.out.println(line);
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

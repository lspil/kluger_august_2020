package managers;

import model.Cursant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import repositories.CursantRepository;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class FileSaveManager {

  private final CursantRepository cursantRepository;

  @Autowired
  public FileSaveManager(CursantRepository cursantRepository) {
    this.cursantRepository = cursantRepository;
  }

  public List<Cursant> readFromFile(String file) {
    Path path = Paths.get(file);
    try {
      return Files.lines(path)
              .map(s -> Arrays.asList(s.split(",")))
              .map(q -> new Cursant(Integer.parseInt(q.get(0)), q.get(1)))
              .collect(Collectors.toList());
    } catch (IOException e) {
      return Collections.emptyList();
    }
  }

  public void saveToFile(String file) {
    List<Cursant> cursanti = cursantRepository.findAll();

    try (PrintStream out = new PrintStream(file)) {
      cursanti.forEach(c -> out.println(c.getId() + "," + c.getNume()));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}

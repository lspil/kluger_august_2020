package repositories;

import model.Cursant;

import java.util.List;
import java.util.Optional;

public interface CursantRepository {

  void adaugaCursant(Cursant c);
  Optional<Cursant> findByName(String name);
  List<Cursant> findAll();
}

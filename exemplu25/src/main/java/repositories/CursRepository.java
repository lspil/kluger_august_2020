package repositories;

import model.Curs;

import java.util.Optional;

public interface CursRepository {

  void addCurs(Curs curs);
  Optional<Curs> findByName(String name);
}

package services;

import exceptions.AlreadyExistingCursantException;
import model.Cursant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import repositories.CursantRepository;

import java.util.List;

@Component
public class CursantService {

  private final CursantRepository cursantRepository;

  @Autowired
  public CursantService(CursantRepository cursantRepository) {
    this.cursantRepository = cursantRepository;
  }

  public void adaugaCursant(Cursant c) {
    var optionalCursant = cursantRepository.findByName(c.getNume());

    if (optionalCursant.isEmpty()) {
      cursantRepository.adaugaCursant(c);
    } else {
      throw new AlreadyExistingCursantException();
    }
  }

  public List<Cursant> findAll() {
    return cursantRepository.findAll();
  }
}

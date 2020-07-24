package services;

import exceptions.AlreadyExistingCursException;
import model.Curs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import repositories.CursRepository;

@Component
public class CursService {

  private final CursRepository cursRepository;

  @Autowired
  public CursService(CursRepository cursRepository) {
    this.cursRepository = cursRepository;
  }

  public void addCurs(Curs curs) {
    var optionalCurs = cursRepository.findByName(curs.getName());

    if (optionalCurs.isEmpty()) {
      cursRepository.addCurs(curs);
    } else {
      throw new AlreadyExistingCursException();
    }
  }


}

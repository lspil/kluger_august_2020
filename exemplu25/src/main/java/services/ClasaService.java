package services;

import exceptions.InexistentCursException;
import model.Clasa;
import model.Curs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import repositories.ClasaRepository;
import repositories.CursRepository;

@Component
public class ClasaService {

  private final ClasaRepository clasaRepository;
  private final CursRepository cursRepository;

  @Autowired
  public ClasaService(ClasaRepository clasaRepository,
                      CursRepository cursRepository) {
    this.clasaRepository = clasaRepository;
    this.cursRepository = cursRepository;
  }

  public void addClasa(Clasa clasa) {
    var optionalCurs = cursRepository.findByName(clasa.getCurs().getName());

    Curs curs = optionalCurs.orElseThrow(() -> new InexistentCursException());

    clasa.setCurs(curs);
    clasaRepository.addClasa(clasa);
  }
}

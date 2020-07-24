package test;

import config.ProjectConfig;
import exceptions.AlreadyExistingCursantException;
import model.Cursant;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import repositories.CursantRepository;
import services.CursantService;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = ProjectConfig.class)
public class AdaugaCursantTests {

  @MockBean
  private CursantRepository cursantRepository;

  @Autowired
  private CursantService cursantService;

  @Test
  public void adaugaCursantTest() {
    Cursant c = new Cursant();
    c.setNume("john");

    when(cursantRepository.findByName(c.getNume()))
            .thenReturn(Optional.empty());

    cursantService.adaugaCursant(c);

    verify(cursantRepository).adaugaCursant(c);
  }

  @Test
  public void adaugaCursantExstingCursantTest() {
    Cursant c = new Cursant();
    c.setNume("john");

    when(cursantRepository.findByName(c.getNume()))
            .thenReturn(Optional.of(c));

    assertThrows(AlreadyExistingCursantException.class,
            () -> cursantService.adaugaCursant(c));

    verify(cursantRepository, never()).adaugaCursant(c);
  }
}

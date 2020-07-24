package test;

import config.ProjectConfig;
import exceptions.AlreadyExistingCursException;
import model.Curs;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import repositories.CursRepository;
import services.CursService;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = ProjectConfig.class)
public class AddCursTests {

  @MockBean
  private CursRepository cursRepository;

  @Autowired
  private CursService cursService;

  @Test
  @DisplayName("Testing that a new course record is added when" +
          " a course with the same doesn't exist.")
  public void addCurs1Test() {
    Curs c = new Curs();
    c.setName("java");

    when(cursRepository.findByName(c.getName()))
            .thenReturn(Optional.empty());

    cursService.addCurs(c);

    verify(cursRepository).addCurs(c);
  }

  @Test
  @DisplayName("Testing that a new course record is not added when" +
          " a course with the same already exists.")
  public void addCurs2Test() {
    Curs c = new Curs();
    c.setName("java");

    when(cursRepository.findByName(c.getName()))
            .thenReturn(Optional.of(c));

    assertThrows(AlreadyExistingCursException.class,
            () -> cursService.addCurs(c));

    verify(cursRepository, never()).addCurs(c);
  }
}

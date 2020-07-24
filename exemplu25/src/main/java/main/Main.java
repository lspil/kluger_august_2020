package main;

import config.ProjectConfig;
import managers.FileSaveManager;
import model.Curs;
import model.Cursant;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CursService;
import services.CursantService;

public class Main {

  public static void main(String[] args) {
    /*
    Baza de date:
      cursuri
        id (PK), nume, durata
      clase
        id (PK), nume, curs (FK)
      cursanti
        id (PK), nume
      AFTER:
        inscrieri
          id (PK), clasa (FK), cursant (FK)
       Cazuri de utilizare
        - adaugare cursant
        - afisare cursanti
        - adaugare curs
        - adaugare clasa
        - citire & salvare cursanti in fisier
       AFTER:
        - inscrierea unui cursant in clasa
        - eliminarea unui cursant dintr-o clasa

        OBS: Spring, Teste unitare  (TDD)
     */

    AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(ProjectConfig.class);

//    CursantService service = context.getBean(CursantService.class);
//
//    service.findAll().forEach(c -> System.out.println(c.getNume()));

//    CursService cursService = context.getBean(CursService.class);
//
//    Curs c = new Curs();
//    c.setName("Java");
//    c.setDurata(40);
//
//    cursService.addCurs(c);

    FileSaveManager m = context.getBean(FileSaveManager.class);
    m.saveToFile("cursanti.txt");
  }
}

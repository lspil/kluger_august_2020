package repositories;

import model.Clasa;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class MySQLClasaRepository implements ClasaRepository {

  private final JdbcTemplate jdbcTemplate;

  public MySQLClasaRepository(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  public void addClasa(Clasa clasa) {
    String sql = "INSERT INTO clasa VALUES (NULL, ?, ?)";
    jdbcTemplate.update(sql, clasa.getNume(), clasa.getCurs().getId());
  }
}

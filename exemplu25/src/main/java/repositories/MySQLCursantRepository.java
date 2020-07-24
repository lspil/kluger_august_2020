package repositories;

import mappers.CursantMapper;
import model.Cursant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class MySQLCursantRepository implements CursantRepository {

  private final JdbcTemplate jdbcTemplate;

  @Autowired
  public MySQLCursantRepository(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  public void adaugaCursant(Cursant c) {
    String sql = "INSERT INTO cursant VALUES (NULL, ?)";
    jdbcTemplate.update(sql, c.getNume());
  }

  public Optional<Cursant> findByName(String name) {
    String sql = "SELECT * FROM cursant WHERE name = ?";

    RowMapper<Cursant> rm = new CursantMapper();

    try {
      Cursant c = jdbcTemplate.queryForObject(sql, rm, name);
      return Optional.of(c);
    } catch (EmptyResultDataAccessException e) {
      return Optional.empty();
    }

  }

  public List<Cursant> findAll() {
    String sql = "SELECT * FROM cursant";

    RowMapper<Cursant> rm = new CursantMapper();

    return jdbcTemplate.query(sql, rm);
  }
}

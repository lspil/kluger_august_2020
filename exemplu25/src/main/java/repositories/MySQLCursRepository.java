package repositories;

import mappers.CursMapper;
import model.Curs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class MySQLCursRepository implements CursRepository {

  private final JdbcTemplate jdbcTemplate;

  @Autowired
  public MySQLCursRepository(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  public void addCurs(Curs curs) {
    String sql = "INSERT INTO curs VALUES (NULL, ?, ?)";
    jdbcTemplate.update(sql, curs.getName(), curs.getDurata());
  }

  public Optional<Curs> findByName(String name) {
    String sql = "SELECT * FROM curs WHERE name = ?";

    RowMapper<Curs> rm = new CursMapper();

    try {
      Curs c = jdbcTemplate.queryForObject(sql, rm, name);
      return Optional.of(c);
    } catch (EmptyResultDataAccessException e) {
      return Optional.empty();
    }
  }

}

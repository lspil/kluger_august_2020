package mappers;

import model.Curs;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CursMapper implements RowMapper<Curs> {

  @Override
  public Curs mapRow(ResultSet resultSet, int i) throws SQLException {
    Curs c = new Curs();
    c.setId(resultSet.getInt("id"));
    c.setName(resultSet.getString("name"));
    c.setDurata(resultSet.getInt("durata"));
    return c;
  }
}

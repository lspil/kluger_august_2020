package mappers;

import model.Cursant;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class CursantMapper implements RowMapper<Cursant> {

  @Override
  public Cursant mapRow(ResultSet rs, int i) throws SQLException {
    Cursant c = new Cursant();
    c.setId(rs.getInt("id"));
    c.setNume(rs.getString("name"));
    return c;
  }
}

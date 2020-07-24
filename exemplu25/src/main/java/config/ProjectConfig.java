package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"managers", "services", "repositories"})
public class ProjectConfig {

  @Bean
  public DataSource dataSource() {
    var ds = new DriverManagerDataSource();
    ds.setUrl("jdbc:mysql://localhost/curs");
    ds.setUsername("root");
    ds.setPassword("");
    return ds;
  }

  @Bean
  public JdbcTemplate jdbcTemplate() {
    return new JdbcTemplate(dataSource());
  }
}

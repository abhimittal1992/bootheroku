package netgloo.configs;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class DatabaseConfig {

  
  @ConfigurationProperties(prefix = "spring.datasource")
  public DataSource dataSource() {
      return DataSourceBuilder.create().build();
  }



} // class DatabaseConfig

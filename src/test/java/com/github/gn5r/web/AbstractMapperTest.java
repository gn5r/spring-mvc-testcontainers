package com.github.gn5r.web;

import org.flywaydb.core.Flyway;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.testcontainers.containers.MySQLContainer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/META-INF/test-context.xml"})
public abstract class AbstractMapperTest {

  private static final MySQLContainer<?> container = new MySQLContainer<>("mysql:8.0")
    .withConfigurationOverride("mysql-conf-override")
    .withDatabaseName("mvc");
  private static final Logger log = LoggerFactory.getLogger(AbstractMapperTest.class);

  static {
    container.start();
    log.info("MySQL container started");
  }

  @DynamicPropertySource
  static void dynamicProperties(DynamicPropertyRegistry registry) {
    registry.add("jdbc.url", container::getJdbcUrl);
    registry.add("jdbc.username", container::getUsername);
    registry.add("jdbc.password", container::getPassword);
  }

  @BeforeClass
  public static void beforeClass() {
    if (!container.isRunning()) container.start();
    log.info("Flyway starting...");
    Flyway.configure()
      .dataSource(container.getJdbcUrl(), container.getUsername(), container.getPassword())
      .load()
      .migrate();
    log.info("Flyway finished...");
  }

  @AfterClass
  public static void afterClass() {
    Flyway.configure()
      .dataSource(container.getJdbcUrl(), container.getUsername(), container.getPassword())
      .cleanDisabled(false)
      .load()
      .clean();
  }

  protected Logger getLog(Class<?> clazz) {
    return LoggerFactory.getLogger(clazz);
  }
}

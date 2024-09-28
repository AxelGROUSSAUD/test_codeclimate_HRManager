package co.simplon.alt6.redthread.employeemanager.employeemanager.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.Employee;
import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository.EmployeeDao;
import java.io.InputStreamReader;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;

/*
Classe qui permet de tester la persistance des données des employés
 */
@SpringBootTest
@Sql(scripts = {"/CREATE_DB_TEST.sql", "/INSERT_DATASET_IN_DBTEST.sql"})
@Sql(
    scripts = {"/TRIGGERS.sql"},
    config = @SqlConfig(separator = "$$"))
public class EmployeeDaoTest {
  @Autowired private DataSource dataSource;

  @Autowired EmployeeDao dao;

  void setUp() {

    // Crée la BDD de test
    try {
      ScriptRunner runner = new ScriptRunner(dataSource.getConnection());
      runner.runScript(
          new InputStreamReader(getClass().getResourceAsStream("/CREATE_DB_TEST.sql")));
    } catch (SQLException e) {
      e.printStackTrace();
    }

    // Insère un jeu de données dans la BDD de test
    try {
      ScriptRunner runner = new ScriptRunner(dataSource.getConnection());

      runner.runScript(
          new InputStreamReader(getClass().getResourceAsStream("/INSERT_DATASET_IN_DBTEST.sql")));
    } catch (SQLException e) {
      e.printStackTrace();
    }

    // Crée les triggers
    try {
      ScriptRunner runner = new ScriptRunner(dataSource.getConnection());
      runner.setSendFullScript(true);
      runner.runScript(new InputStreamReader(getClass().getResourceAsStream("/TRIGGERS.sql")));
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  @Test
  void testAdd() {
    Employee employee = new Employee(2, "Dog", "Snoop", "sdog3@test.com", "WOUF.wouf87");
    assertTrue(dao.add(employee));
    assertNotNull(employee.getId());
    assertEquals(13, employee.getId());
    assertEquals(2, employee.getIdTeam());
  }

  @Test
  void testAddNullIdTeam() {
    Employee employee = new Employee(null, "Dog", "Snoop", "sdog3@test.com", "WOUF.wouf87");
    assertTrue(dao.add(employee));
    assertNotNull(employee.getId());
    assertEquals(13, employee.getId());
    assertEquals(0, employee.getIdTeam());
  }

  @Test
  void testAddNegativeIdTeam() {
    Employee employee = new Employee(-38, "Dog", "Snoop", "sdog3@test.com", "WOUF.wouf87");
    assertTrue(dao.add(employee));
    assertNotNull(employee.getId());
    assertEquals(13, employee.getId());
    assertEquals(0, employee.getIdTeam());
  }

  @Test
  void testDelete() {}

  @Test
  void testDeleteNoMatchingId() {}

  @Test
  void testGetAll() {}

  @Test
  void testGetById() {}

  @Test
  void testGetByIdNoResult() {}

  @Test
  void testUpdate() {}

  @Test
  void testUpdateNoMatchingId() {}
}

package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.Employee;
import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository.interfaces.EmployeeDaoI;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.stereotype.Repository;

/*
 * Classe qui permet de gérer la persistance d'un objet employé.
 * @Repository permet d'indiquer que ...
 */
@Repository
public class EmployeeDao extends AbstractDao<Employee> implements EmployeeDaoI {

  private StatusDao statusDao = new StatusDao();
  private Integer idStatus;

  // Constructeur de la classe
  public EmployeeDao() {
    super(
        "INSERT INTO employee(idStatus, name, firstName, mail, password, job) VALUES (?, ?, ?, ?,"
            + " ?, ?)",
        "SELECT * FROM employee",
        "SELECT * FROM employee WHERE id = ?",
        "UPDATE employee SET idStatus = ?, name = ?, firstName = ?, mail = ?, password = ?, job = ?"
            + " WHERE id = ?",
        "DELETE FROM employee WHERE id = ?");
  }

  // Méthode abstraite qui permet de récupérer l'id d'un objet
  @Override
  protected void setEntityId(Employee entity, int id) {
    entity.setId(id);
  }

  // Méthode permettant de remplacer les parenthèse dans la requête SQL INSERT par les valeurs des
  // attributs d'un objet employé.
  @Override
  protected void entityBindValues(PreparedStatement stmt, Employee entity) throws SQLException {
    stmt.setInt(1, entity.getStatus().getId());
    stmt.setString(2, entity.getName());
    stmt.setString(3, entity.getFirstName());
    stmt.setString(4, entity.getMail());
    stmt.setString(5, entity.getPassword());
    stmt.setString(6, entity.getJob());
  }

  // Méthode permettant de remplacer les parenthèse dans la requête SQL UPDATE par les valeurs des
  // attributs d'un objet employé.
  @Override
  protected void entityBindValuesWithId(PreparedStatement stmt, Employee entity)
      throws SQLException {
    this.entityBindValues(stmt, entity);
    stmt.setInt(7, entity.getId());
  }

  // Méthode qui permet de transformer un objet SQL en objet employé.
  @Override
  protected Employee sqlToEntity(ResultSet rs) throws SQLException {
    this.idStatus = rs.getInt("idStatus");

    return new Employee(
        rs.getInt("id"),
        this.statusDao.getById(idStatus),
        rs.getString("name"),
        rs.getString("firstName"),
        rs.getString("mail"),
        rs.getString("password"),
        rs.getString("job"));
  }
}

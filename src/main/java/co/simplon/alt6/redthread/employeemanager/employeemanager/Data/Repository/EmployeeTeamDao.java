package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.EmployeeTeam;
import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository.interfaces.EmployeeTeamDaoI;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeTeamDao extends AbstractDao<EmployeeTeam> implements EmployeeTeamDaoI {

  private EmployeeDao employeeDao = new EmployeeDao();
  private TeamDao teamDao = new TeamDao();
  private Integer idEmployee;
  private Integer idTeam;

  public EmployeeTeamDao() {
    super(
        "INSERT INTO employeeTeam (idEmployee, idTeam) VALUES (?, ?)",
        "SELECT * FROM employeeTeam",
        "SELECT * FROM employeeTeam WHERE id = ?",
        "UPDATE employeeTeam SET idEmployee = ?, idTeam = ? WHERE id = ?",
        "DELETE FROM employeeTeam WHERE id = ?");
  }

  @Override
  protected void setEntityId(EmployeeTeam entity, int id) {
    entity.setId(id);
  }

  @Override
  protected void entityBindValues(PreparedStatement stmt, EmployeeTeam entity) throws SQLException {
    stmt.setInt(1, entity.getEmployee().getId());
    stmt.setInt(2, entity.getTeam().getId());
  }

  @Override
  protected void entityBindValuesWithId(PreparedStatement stmt, EmployeeTeam entity)
      throws SQLException {
    this.entityBindValues(stmt, entity);
    stmt.setInt(3, entity.getId());
  }

  @Override
  protected EmployeeTeam sqlToEntity(ResultSet rs) throws SQLException {
    this.idEmployee = rs.getInt("idEmployee");
    this.idTeam = rs.getInt("idTeam");

    return new EmployeeTeam(
        rs.getInt("id"),
        this.employeeDao.getById(this.idEmployee),
        this.teamDao.getById(this.idTeam));
  }
}

package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.leaveRequest;
import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository.interfaces.LeaveRequestDaoI;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class leaveRequestDao extends AbstractDao<leaveRequest> implements LeaveRequestDaoI {

  private EmployeeDao employeeDao = new EmployeeDao();
  private StatusDao statusDao = new StatusDao();

  public leaveRequestDao() {
    super(
        "INSERT INTO leaveRequest (idEmployee, idStatus, startDate, endDate, groundsRefusal) VALUES"
            + " (?, ?, ?, ?, ?)",
        "SELECT * FROM leaveRequest",
        "SELECT * FROM leaveRequest WHERE id = ?",
        "UPDATE leaveRequest SET idEmployee = ?, idStatus = ?, startDate = ?, endDate = ?,"
            + " groundsRefusal = ? WHERE id = ?",
        "DELETE FROM leaveRequest WHERE id = ?");
  }

  @Override
  protected void setEntityId(leaveRequest entity, int id) {
    entity.setId(id);
  }

  @Override
  protected void entityBindValues(PreparedStatement stmt, leaveRequest entity) throws SQLException {
    stmt.setInt(1, entity.getEmployee().getId());
    stmt.setInt(2, entity.getStatus().getId());
    stmt.setDate(3, Date.valueOf(entity.getStartDate()));
    stmt.setDate(4, Date.valueOf(entity.getEndDate()));
    stmt.setString(5, entity.getGroundsRefusal());
  }

  @Override
  protected void entityBindValuesWithId(PreparedStatement stmt, leaveRequest entity)
      throws SQLException {
    this.entityBindValues(stmt, entity);
    stmt.setInt(6, entity.getId());
  }

  @Override
  protected leaveRequest sqlToEntity(ResultSet rs) throws SQLException {
    int idEmployee = rs.getInt("idEmployee");
    int idStatus = rs.getInt("idStatus");

    return new leaveRequest(
        rs.getInt("id"),
        LocalDate.parse(rs.getDate("startDate").toString()),
        LocalDate.parse(rs.getDate("endDate").toString()),
        rs.getString("groundsRefusal"),
        this.employeeDao.getById(idEmployee),
        this.statusDao.getById(idStatus));
  }
}

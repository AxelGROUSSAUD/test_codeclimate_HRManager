package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.Payslip;
import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository.interfaces.PayslipDaoI;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class PayslipDao extends AbstractDao<Payslip> implements PayslipDaoI {

  private EmployeeDao employeeDao = new EmployeeDao();
  private Integer idEmployee;

  public PayslipDao() {
    super(
        "INSERT INTO payslip (idEmployee, date, payslip) VALUES (?, ?, ?)",
        "SELECT * FROM payslip",
        "SELECT * FROM payslip WHERE id = ?",
        "UPDATE payslip SET idEmployee = ? date = ?, payslip = ? WHERE id = ?",
        "DELETE FROM payslip WHERE id = ?");
  }

  @Override
  protected void setEntityId(Payslip entity, int id) {
    entity.setId(id);
  }

  @Override
  protected void entityBindValues(PreparedStatement stmt, Payslip entity) throws SQLException {
    stmt.setInt(1, entity.getEmployee().getId());
    stmt.setDate(2, Date.valueOf(entity.getDate()));
    stmt.setString(3, entity.getPayslip());
  }

  @Override
  protected void entityBindValuesWithId(PreparedStatement stmt, Payslip entity)
      throws SQLException {
    this.entityBindValues(stmt, entity);
    stmt.setInt(4, entity.getId());
  }

  @Override
  protected Payslip sqlToEntity(ResultSet rs) throws SQLException {
    this.idEmployee = rs.getInt("idEmployee");

    return new Payslip(
        rs.getInt("id"),
        this.employeeDao.getById(this.idEmployee),
        LocalDate.parse(rs.getDate("date").toString()),
        rs.getString("payslip"));
  }
}

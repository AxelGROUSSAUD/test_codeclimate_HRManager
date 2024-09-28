package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.Message;
import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository.interfaces.MessageDaoI;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class MessageDao extends AbstractDao<Message> implements MessageDaoI {

  private EmployeeDao employeeDao = new EmployeeDao();
  private StatusDao statusDao = new StatusDao();
  private Integer idEmployee;
  private Integer idStatus;

  public MessageDao() {
    super(
        "INSERT INTO notification(idEmployee, idStatus, date, author, title, message) VALUES (?, ?,"
            + " ?, ?, ?, ?)",
        "SELECT * FROM notification",
        "SELECT * FROM notification WHERE id = ?",
        "UPDATE notification SET idEmployee = ?, idStatus = ?, date = ?, author = ?, title = ?,"
            + " message = ? WHERE id = ?",
        "DELETE FROM notification WHERE id = ?");
  }

  @Override
  protected void setEntityId(Message entity, int id) {
    entity.setId(id);
  }

  @Override
  protected void entityBindValues(PreparedStatement stmt, Message entity) throws SQLException {
    stmt.setInt(1, entity.getEmployee().getId());
    stmt.setInt(2, entity.getStatus().getId());
    stmt.setDate(3, Date.valueOf(entity.getDate()));
    stmt.setString(4, entity.getAuthor());
    stmt.setString(5, entity.getTitle());
    stmt.setString(6, entity.getMessage());
  }

  @Override
  protected void entityBindValuesWithId(PreparedStatement stmt, Message entity)
      throws SQLException {
    this.entityBindValues(stmt, entity);
    stmt.setInt(7, entity.getId());
  }

  @Override
  protected Message sqlToEntity(ResultSet rs) throws SQLException {
    this.idEmployee = rs.getInt("idEmployee");
    this.idStatus = rs.getInt("idStatus");

    return new Message(
        rs.getInt("id"),
        this.employeeDao.getById(this.idEmployee),
        this.statusDao.getById(this.idStatus),
        LocalDate.parse(rs.getDate("date").toString()),
        rs.getString("author"),
        rs.getString("title"),
        rs.getString("message"));
  }
}

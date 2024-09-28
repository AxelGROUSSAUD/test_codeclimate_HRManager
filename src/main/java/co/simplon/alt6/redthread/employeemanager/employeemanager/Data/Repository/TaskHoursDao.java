package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.TaskHours;
import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository.interfaces.TaskHoursDaoI;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TaskHoursDao extends AbstractDao<TaskHours> implements TaskHoursDaoI {

  private TaskDao taskDao = new TaskDao();
  private HoursDao hoursDao = new HoursDao();
  private Integer idTask;
  private Integer idHours;

  public TaskHoursDao() {
    super(
        "INSERT INTO taskHours (idTask, idHours, timePassedToday) VALUES (?, ?, ?)",
        "SELECT * FROM taskHours",
        "SELECT * FROM taskHours WHERE id = ?",
        "UPDATE taskHours SET idTask = ?, idHours = ?, timePassedToday = ? WHERE id = ?",
        "DELETE FROM taskHours WHERE id = ?");
  }

  @Override
  protected void setEntityId(TaskHours entity, int id) {
    entity.setId(id);
  }

  @Override
  protected void entityBindValues(PreparedStatement stmt, TaskHours entity) throws SQLException {
    stmt.setInt(1, entity.getTask().getId());
    stmt.setInt(2, entity.getHours().getId());
    stmt.setTime(3, entity.getTimePassedToday());
  }

  @Override
  protected void entityBindValuesWithId(PreparedStatement stmt, TaskHours entity)
      throws SQLException {
    this.entityBindValues(stmt, entity);
    stmt.setInt(4, entity.getId());
  }

  @Override
  protected TaskHours sqlToEntity(ResultSet rs) throws SQLException {
    this.idTask = rs.getInt("idTask");
    this.idHours = rs.getInt("idHours");

    return new TaskHours(
        rs.getInt("id"),
        this.taskDao.getById(idTask),
        this.hoursDao.getById(idHours),
        rs.getTime("timePassedToday"));
  }
}

package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.Task;
import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository.interfaces.TaskDaoI;

public class TaskDao extends AbstractDao<Task> implements TaskDaoI{

    private EmployeeDao employeeDao = new EmployeeDao();
    private ProjectDao projectDao = new ProjectDao();
    private StatusDao statusDao = new StatusDao();
    private Integer idEmployee;
    private Integer idProject;
    private Integer idStatus;

    public TaskDao() {
        super(
            "INSERT INTO task (idEmployee, idProject, idStatus, name, description, startDate, endDate, estimatedDuration, progress, timePassed, isAssign, comment) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
            "SELECT * FROM task",
            "SELECT * FROM task WHERE id = ?",
            "UPDATE task SET idEmployee = ?, idProject = ?, idStatus = ?, name = ?, description = ?, startDate = ?, endDate = ?, estimatedDuration = ?, progress = ?, timePassed = ?, isAssign = ?, comment = ? WHERE id = ?",
            "DELETE FROM task WHERE id = ?"
        );
    }

    @Override
    protected void setEntityId(Task entity, int id) {
        entity.setId(id);
    }

    @Override
    protected void entityBindValues(PreparedStatement stmt, Task entity) throws SQLException {
        stmt.setInt(1, entity.getEmployee().getId());
        stmt.setInt(2, entity.getProject().getId());
        stmt.setInt(3, entity.getStatus().getId());
        stmt.setString(4, entity.getName());
        stmt.setString(5, entity.getDescription());
        stmt.setDate(6, Date.valueOf(entity.getStartDate()));
        stmt.setDate(7, Date.valueOf(entity.getEndDate()));
        stmt.setTime(8, entity.getEstimatedDuration());
        stmt.setInt(9, entity.getProgress());
        stmt.setTime(10, entity.getTimePassed());
        stmt.setBoolean(11, entity.getIsAssign());
        stmt.setString(12, entity.getComment());
    }

    @Override
    protected void entityBindValuesWithId(PreparedStatement stmt, Task entity) throws SQLException {
        this.entityBindValues(stmt, entity);
        stmt.setInt(13, entity.getId());
    }

    @Override
    protected Task sqlToEntity(ResultSet rs) throws SQLException {
        this.idEmployee = rs.getInt("idEmployee");
        this.idProject = rs.getInt("idProject");
        this.idStatus = rs.getInt("idStatus");

        return new Task(
            rs.getInt("id")
            , this.employeeDao.getById(this.idEmployee)
            , this.projectDao.getById(this.idProject)
            , this.statusDao.getById(this.idStatus)
            , rs.getString("name")
            , rs.getString("description")
            , LocalDate.parse(rs.getDate("startDate").toString())
            , LocalDate.parse(rs.getDate("endDate").toString())
            , rs.getTime("estimatedDuration")
            , rs.getInt("progress")
            , rs.getTime("timePassed")
            , rs.getBoolean("isAssign")
            , rs.getString("comment")
            );
    }
    
}

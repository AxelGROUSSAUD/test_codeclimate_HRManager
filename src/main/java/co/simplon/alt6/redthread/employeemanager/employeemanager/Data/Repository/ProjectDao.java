package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import org.springframework.stereotype.Repository;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.Project;
import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository.interfaces.ProjectDaoI;

@Repository
public class ProjectDao extends AbstractDao<Project> implements ProjectDaoI{

    

    public ProjectDao() {
        super(
            "INSERT INTO project (name, description, startDate, timePassed, comment) VALUES (?, ?, ?, ?, ?)",
            "SELECT * FROM project",
            "SELECT * FROM project WHERE id = ?",
            "UPDATE project SET name = ?, description = ?, startDate = ?, timePassed = ?, comment = ? WHERE id = ?",
            "DELETE FROM project WHERE id = ?"
        );
    }

    @Override
    protected void setEntityId(Project entity, int id) {
        entity.setId(id);
    }

    @Override
    protected void entityBindValues(PreparedStatement stmt, Project entity) throws SQLException {
        stmt.setString(1, entity.getName());
        stmt.setString(2, entity.getDescription());
        stmt.setDate(3, Date.valueOf(entity.getStartDate()));
        stmt.setTime(4, entity.getTimePassed());
        stmt.setString(5, entity.getComment());
    }

    @Override
    protected void entityBindValuesWithId(PreparedStatement stmt, Project entity) throws SQLException {
        this.entityBindValues(stmt, entity);
        stmt.setInt(6, entity.getId());
    }

    @Override
    protected Project sqlToEntity(ResultSet rs) throws SQLException {

        return new Project(
            rs.getInt("id")
            , rs.getString("name")
            , rs.getString("description")
            , LocalDate.parse(rs.getDate("startDate").toString())
            , rs.getTime("timePassed")
            , rs.getString("comment")
            );
    }
    
}

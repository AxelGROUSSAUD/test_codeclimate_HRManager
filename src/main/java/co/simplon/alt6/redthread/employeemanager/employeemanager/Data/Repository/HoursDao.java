package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.Hours;
import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository.interfaces.HoursDaoI;

public class HoursDao extends AbstractDao<Hours> implements HoursDaoI{

    private EmployeeDao employeeDao = new EmployeeDao();
    private Integer idEmployee;

    private StatusDao statusDao = new StatusDao();
    private Integer idStatus;
    
    public HoursDao() {
        super(
            "INSERT INTO hours (idStatus, idEmployee, hoursNumber, date) VALUES (?, ?, ?, ?)",
            "SELECT * FROM hours",
            "SELECT * FROM hours WHERE id = ?",
            "UPDATE hours SET idStatus = ?, idEmployee = ?, hoursNumber = ?, date = ? WHERE id = ?",
            "DELETE FROM hours WHERE id = ?"
        );
        
    }

    @Override
    protected void setEntityId(Hours entity, int id) {
        entity.setId(id);
    }

    @Override
    protected void entityBindValues(PreparedStatement stmt, Hours entity) throws SQLException {
        stmt.setInt(1,entity.getStatus().getId());
        stmt.setInt(2, entity.getEmployee().getId());
        stmt.setTime(3, entity.getHoursNumber());
        stmt.setDate(4, Date.valueOf(entity.getDate()));
        
    }

    @Override
    protected void entityBindValuesWithId(PreparedStatement stmt, Hours entity) throws SQLException {
        this.entityBindValues(stmt, entity);
        stmt.setInt(5, entity.getId());
    }

    @Override
    protected Hours sqlToEntity(ResultSet rs) throws SQLException {
        this.idEmployee = rs.getInt("idEmployee");
        this.idStatus = rs.getInt("idStatus");

        return new Hours(
            rs.getInt("id")
            , this.statusDao.getById(idStatus)
            , this.employeeDao.getById(idEmployee)
            , rs.getTime("hoursNumber")
            , LocalDate.parse(rs.getDate("date").toString())
            );
    }


   


    
    
}

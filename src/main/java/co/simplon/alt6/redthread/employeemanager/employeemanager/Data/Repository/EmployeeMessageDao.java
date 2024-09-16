package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.EmployeeMessage;
import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository.interfaces.EmployeeMessageDaoI;

public class EmployeeMessageDao extends AbstractDao<EmployeeMessage> implements EmployeeMessageDaoI{

    private EmployeeDao employeeDao = new EmployeeDao();
    private MessageDao messageDao = new MessageDao();
    private Integer idEmployee;
    private Integer idMessage;

    public EmployeeMessageDao() {
        super("INSERT INTO employeeMessage (idEmployee, idMessage) VALUES (?, ?)"
        , "SELECT * FROM employeeMessage"
        , "SELECT * FROM employeeMessage WHERE id = ?"
        , "UPDATE employeeMessage SET idEmployee = ?, idMessage = ? WHERE id = ?"
        , "DELETE FROM employeeMessage WHERE id = ?");
    }

    @Override
    protected void setEntityId(EmployeeMessage entity, int id) {
        entity.setId(id);
    }

    @Override
    protected void entityBindValues(PreparedStatement stmt, EmployeeMessage entity) throws SQLException {
        stmt.setInt(1, entity.getEmployee().getId());
        stmt.setInt(2, entity.getMessage().getId());
    }

    @Override
    protected void entityBindValuesWithId(PreparedStatement stmt, EmployeeMessage entity) throws SQLException {
        this.entityBindValues(stmt, entity);
        stmt.setInt(3, entity.getId());
    }

    @Override
    protected EmployeeMessage sqlToEntity(ResultSet rs) throws SQLException {
        this.idEmployee = rs.getInt("idEmployee");
        this.idMessage = rs.getInt("idNotification");

        return new EmployeeMessage(
            rs.getInt("id")
            , this.employeeDao.getById(this.idEmployee)
            , this.messageDao.getById(this.idMessage));
    }

}

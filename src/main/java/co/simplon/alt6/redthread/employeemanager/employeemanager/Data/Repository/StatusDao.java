package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.Status;
import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository.interfaces.StatusDaoI;

/*
 * Classe qui permet de gérer la persistance d'un objet status
 * @Repository permet d'indiquer ...
 */
@Repository
public class StatusDao extends AbstractDao<Status> implements StatusDaoI{

    //Constructeur du DAO pour les status.
    public StatusDao() {
        super(
            "INSERT INTO status (name, statusType) VALUES (?, ?)", 
            "SELECT * FROM status", 
            "SELECT * FROM status where id = ?", 
            "UPDATE status SET name = ?, statusType = ? WHERE id = ?", 
            "DELETE FROM status WHERE id = ?"
        );
        
    }

    
    @Override
    protected void setEntityId(Status entity, int id) {
        entity.setId(id);
    }

    /*
     * Méthode permettant de remplacer les parenthèse dans la requête SQL INSERT par les valeurs des attributs d'un objet status. 
     */
    @Override
    protected void entityBindValues(PreparedStatement stmt, Status entity) throws SQLException {
        stmt.setString(1, entity.getName());
        stmt.setString(2, entity.getStatusType());
    }

    /*
     * Méthode permettant de remplacer les parenthèse dans la requête SQL UPDATE par les valeurs des attributs d'un objet status. 
     */
    @Override
    protected void entityBindValuesWithId(PreparedStatement stmt, Status entity) throws SQLException {
        this.entityBindValues(stmt, entity);
        stmt.setInt(3, entity.getId());
    }

    /*
     * Méthode permettant de transformer un objet SQL en un objet Status
     */
    @Override
    protected Status sqlToEntity(ResultSet rs) throws SQLException {
        return new Status(
            rs.getInt("id"),
            rs.getString("name"),
            rs.getString("statusType")
        );
    }

}

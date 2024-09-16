package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;


/*
 * Classe générique pour la persistance des données de n'importe quel objet.
 */
public abstract class AbstractDao<E> {
    //Déclaration des variables
    protected String addSQL;
    protected String getAllSQL;
    protected String getByIdSQL;
    protected String updateSQL;
    protected String deleteSQL;
    
    @Autowired
    protected DataSource dataSource;

    //Constructeur de la classe 
    public AbstractDao(String addSQL, String getAllSQL, String getByIdSQL, String updateSQL, String deleteSQL) {
        this.addSQL = addSQL;
        this.getAllSQL = getAllSQL;
        this.getByIdSQL = getByIdSQL;
        this.updateSQL = updateSQL;
        this.deleteSQL = deleteSQL;
    }

    // Méthode qui récupère tous les objets
    public List<E> getAll() {
        List<E> list = new ArrayList<>();
        try (Connection connection = dataSource.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement(getAllSQL);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                E entity = sqlToEntity(rs);
                list.add(entity);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    //Méthode qui récupère un objet selon son ID
    public E getById(int id) {
        try (Connection connection = dataSource.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement(getByIdSQL);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()) {
                E entity = sqlToEntity(rs);
                return entity;

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    //Méthode qui supprime un objet
    public boolean delete(int id) {
        try (Connection connection = dataSource.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement(deleteSQL);
            stmt.setInt(1,id);

            return stmt.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    //Méthode qui crée un objet
    public boolean add(E entity) {
        
        try (Connection connection = dataSource.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement(addSQL, Statement.RETURN_GENERATED_KEYS);
            entityBindValues(stmt,entity);
            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            setEntityId(entity, rs.getInt(1));

            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    //Méthode qui modifie un objet
    public boolean update(E entity) {
           
        try (Connection connection = dataSource.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement(updateSQL);
            entityBindValuesWithId(stmt,entity);

            return stmt.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    //Méthode abstraite qui permet de récupérer l'id d'un objet
    protected abstract void setEntityId(E entity, int id);
    //Méthode abstraite qui permet de faire le lien entre les attributs d'un objet en BDD et les attributs d'un objet manipulable
    protected abstract void entityBindValues(PreparedStatement stmt, E entity)  throws SQLException ;
    //Méthode abstraite qui permet de faire le lien entre les attributs d'un objet en BDD et les attributs d'un objet manipulable avec un l'ID
    protected abstract void entityBindValuesWithId(PreparedStatement stmt, E entity)  throws SQLException ;
    //Méthode qui permet de transformer un objet SQL en objet manipulable.
    protected abstract E sqlToEntity(ResultSet rs) throws SQLException;
}

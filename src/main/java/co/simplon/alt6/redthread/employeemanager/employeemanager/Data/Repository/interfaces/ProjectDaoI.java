package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository.interfaces;

import java.util.List;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.Project;

public interface ProjectDaoI extends Dao<Project>{
    boolean add(Project entity);
    List<Project> getAll();
    Project getById(int id);
    boolean update(Project entity);
    boolean delete(int id);
}

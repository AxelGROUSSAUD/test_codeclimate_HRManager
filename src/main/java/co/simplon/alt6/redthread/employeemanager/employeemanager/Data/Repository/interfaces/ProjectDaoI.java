package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository.interfaces;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.Project;
import java.util.List;

public interface ProjectDaoI extends Dao<Project> {
  boolean add(Project entity);

  List<Project> getAll();

  Project getById(int id);

  boolean update(Project entity);

  boolean delete(int id);
}

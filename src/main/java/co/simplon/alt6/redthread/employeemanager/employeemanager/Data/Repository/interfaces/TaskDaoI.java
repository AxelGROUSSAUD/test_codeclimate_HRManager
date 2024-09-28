package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository.interfaces;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.Task;
import java.util.List;

public interface TaskDaoI extends Dao<Task> {
  boolean add(Task entity);

  List<Task> getAll();

  Task getById(int id);

  boolean update(Task entity);

  boolean delete(int id);
}

package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository.interfaces;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.TaskHours;
import java.util.List;

public interface TaskHoursDaoI extends Dao<TaskHours> {
  boolean add(TaskHours entity);

  List<TaskHours> getAll();

  TaskHours getById(int id);

  boolean update(TaskHours entity);

  boolean delete(int id);
}

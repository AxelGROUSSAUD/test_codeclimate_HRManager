package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository.interfaces;

import java.util.List;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.TaskHours;

public interface TaskHoursDaoI extends Dao<TaskHours>{
    boolean add(TaskHours entity);
    List<TaskHours> getAll();
    TaskHours getById(int id);
    boolean update(TaskHours entity);
    boolean delete(int id);
}

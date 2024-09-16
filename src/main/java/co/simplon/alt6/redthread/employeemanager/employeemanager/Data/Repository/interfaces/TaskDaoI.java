package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository.interfaces;

import java.util.List;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.Task;

public interface TaskDaoI extends Dao<Task>{
    boolean add(Task entity);
    List<Task> getAll();
    Task getById(int id);
    boolean update(Task entity);
    boolean delete(int id);
}

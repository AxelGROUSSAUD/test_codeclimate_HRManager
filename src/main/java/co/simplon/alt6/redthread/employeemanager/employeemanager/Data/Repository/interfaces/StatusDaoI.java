package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository.interfaces;

import java.util.List;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.Status;

public interface StatusDaoI extends Dao<Status>{
    boolean add(Status entity);
    List<Status> getAll();
    Status getById(int id);
    boolean update(Status entity);
    boolean delete(int id);
}

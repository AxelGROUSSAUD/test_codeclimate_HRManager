package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository.interfaces;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.Status;
import java.util.List;

public interface StatusDaoI extends Dao<Status> {
  boolean add(Status entity);

  List<Status> getAll();

  Status getById(int id);

  boolean update(Status entity);

  boolean delete(int id);
}

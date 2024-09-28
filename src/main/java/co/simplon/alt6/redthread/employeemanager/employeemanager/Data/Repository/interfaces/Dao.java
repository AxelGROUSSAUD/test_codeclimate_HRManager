package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository.interfaces;

import java.util.List;

public interface Dao<E> {
  boolean add(E entity);

  List<E> getAll();

  E getById(int id);

  boolean update(E entity);

  boolean delete(int id);
}

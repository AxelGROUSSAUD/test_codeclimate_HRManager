package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository.interfaces;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.EmployeeMessage;
import java.util.List;

public interface EmployeeMessageDaoI {
  boolean add(EmployeeMessage entity);

  List<EmployeeMessage> getAll();

  EmployeeMessage getById(int id);

  boolean update(EmployeeMessage entity);

  boolean delete(int id);
}

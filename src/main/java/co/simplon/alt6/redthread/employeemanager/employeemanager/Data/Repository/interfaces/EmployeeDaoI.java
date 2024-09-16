package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository.interfaces;

import java.util.List;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.Employee;


public interface EmployeeDaoI extends Dao<Employee>{
    boolean add(Employee entity);
    List<Employee> getAll();
    Employee getById(int id);
    boolean update(Employee entity);
    boolean delete(int id);
}

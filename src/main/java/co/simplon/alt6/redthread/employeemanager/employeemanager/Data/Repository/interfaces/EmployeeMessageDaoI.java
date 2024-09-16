package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository.interfaces;

import java.util.List;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.EmployeeMessage;

public interface EmployeeMessageDaoI {
    boolean add(EmployeeMessage entity);
    List<EmployeeMessage> getAll();
    EmployeeMessage getById(int id);
    boolean update(EmployeeMessage entity);
    boolean delete(int id);
}

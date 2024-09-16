package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository.interfaces;

import java.util.List;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.leaveRequest;

public interface LeaveRequestDaoI extends Dao<leaveRequest>{
    boolean add(leaveRequest entity);
    List<leaveRequest> getAll();
    leaveRequest getById(int id);
    boolean update(leaveRequest entity);
    boolean delete(int id);
}

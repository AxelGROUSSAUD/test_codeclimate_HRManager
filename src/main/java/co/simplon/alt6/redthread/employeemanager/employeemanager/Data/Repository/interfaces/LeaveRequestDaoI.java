package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository.interfaces;

import java.util.List;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.LeaveRequest;

public interface LeaveRequestDaoI extends Dao<LeaveRequest>{
    boolean add(LeaveRequest entity);
    List<LeaveRequest> getAll();
    LeaveRequest getById(int id);
    boolean update(LeaveRequest entity);
    boolean delete(int id);
}

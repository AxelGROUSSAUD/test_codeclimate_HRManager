package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository.interfaces;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.LeaveRequest;
import java.util.List;

public interface LeaveRequestDaoI extends Dao<LeaveRequest> {
  boolean add(LeaveRequest entity);

  List<LeaveRequest> getAll();

  LeaveRequest getById(int id);

  boolean update(LeaveRequest entity);

  boolean delete(int id);
}

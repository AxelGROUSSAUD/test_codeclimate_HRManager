package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository.interfaces;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.leaveRequest;
import java.util.List;

public interface LeaveRequestDaoI extends Dao<leaveRequest> {
  boolean add(leaveRequest entity);

  List<leaveRequest> getAll();

  leaveRequest getById(int id);

  boolean update(leaveRequest entity);

  boolean delete(int id);
}

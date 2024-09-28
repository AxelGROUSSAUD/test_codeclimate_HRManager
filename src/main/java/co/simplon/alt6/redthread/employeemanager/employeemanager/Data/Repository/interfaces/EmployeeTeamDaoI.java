package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository.interfaces;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.EmployeeTeam;
import java.util.List;

public interface EmployeeTeamDaoI {
  boolean add(EmployeeTeam entity);

  List<EmployeeTeam> getAll();

  EmployeeTeam getById(int id);

  boolean update(EmployeeTeam entity);

  boolean delete(int id);
}

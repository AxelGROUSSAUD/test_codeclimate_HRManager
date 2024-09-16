package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository.interfaces;

import java.util.List;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.EmployeeTeam;

public interface EmployeeTeamDaoI {
    boolean add(EmployeeTeam entity);
    List<EmployeeTeam> getAll();
    EmployeeTeam getById(int id);
    boolean update(EmployeeTeam entity);
    boolean delete(int id);
}

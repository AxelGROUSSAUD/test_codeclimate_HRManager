package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository.interfaces;

import java.util.List;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.Team;

public interface TeamDaoI extends Dao<Team>{
    boolean add(Team entity);
    List<Team> getAll();
    Team getById(int id);
    boolean update(Team entity);
    boolean delete(int id);
}

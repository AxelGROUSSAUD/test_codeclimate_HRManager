package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository.interfaces;

import java.util.List;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.Hours;

public interface HoursDaoI extends Dao<Hours>{
    boolean add(Hours entity);
    List<Hours> getAll();
    Hours getById(int id);
    boolean update(Hours entity);
    boolean delete(int id);
}

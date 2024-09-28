package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository.interfaces;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.Payslip;
import java.util.List;

public interface PayslipDaoI extends Dao<Payslip> {
  boolean add(Payslip entity);

  List<Payslip> getAll();

  Payslip getById(int id);

  boolean update(Payslip entity);

  boolean delete(int id);
}

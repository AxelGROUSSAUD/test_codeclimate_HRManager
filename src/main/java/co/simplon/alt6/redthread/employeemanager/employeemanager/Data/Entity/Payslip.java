package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity;

import java.time.LocalDate;

/*
 * Classe qui définit les attributs d'une fiche de paie.
 */
public class Payslip {
  private Integer id;
  private Employee employee;
  private LocalDate date;
  private String payslip;

  public Payslip(Integer id, Employee employee, LocalDate date, String payslip) {
    this.setId(id);
    this.setEmployee(employee);
    this.setDate(date);
    this.setPayslip(payslip);
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Employee getEmployee() {
    return this.employee;
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }

  public LocalDate getDate() {
    return this.date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public String getPayslip() {
    return this.payslip;
  }

  public void setPayslip(String payslip) {
    this.payslip = payslip;
  }
}

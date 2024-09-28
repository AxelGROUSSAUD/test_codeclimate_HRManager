package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity;

import java.sql.Time;
import java.time.LocalDate;

/*
 * Classe qui définit les attributs des horaires.
 */
public class Hours {
  private Integer id;
  private Status status;
  private Employee employee;
  private Time hoursNumber;
  private LocalDate date;

  public Hours(Integer id, Status status, Employee employee, Time hoursNumber, LocalDate date) {
    this.setId(id);
    this.setStatus(status);
    this.setEmployee(employee);
    this.setHoursNumber(hoursNumber);
    this.setDate(date);
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Status getStatus() {
    return this.status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public Employee getEmployee() {
    return this.employee;
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }

  public Time getHoursNumber() {
    return this.hoursNumber;
  }

  public void setHoursNumber(Time hoursNumber) {
    this.hoursNumber = hoursNumber;
  }

  public LocalDate getDate() {
    return this.date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }
}

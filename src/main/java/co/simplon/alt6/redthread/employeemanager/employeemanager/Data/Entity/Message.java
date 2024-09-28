package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity;

import java.time.LocalDate;

/*
 * Classe qui définit les attributs d'une notification
 */
public class Message {
  private Integer id;
  private Employee employee;
  private Status status;
  private LocalDate date;
  private String author;
  private String title;
  private String message;

  public Message(
      Integer id,
      Employee employee,
      Status status,
      LocalDate date,
      String author,
      String title,
      String message) {
    this.setId(id);
    this.setEmployee(employee);
    this.setStatus(status);
    this.setDate(date);
    this.setAuthor(author);
    this.setTitle(title);
    this.setMessage(message);
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

  public Status getStatus() {
    return this.status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public LocalDate getDate() {
    return this.date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public String getAuthor() {
    return this.author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}

package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity;

import java.sql.Time;
import java.time.LocalDate;

/*
 * Classe qui définit les attributs d'un projet.
 */
public class Project {
  private Integer id;
  private String name;
  private String description;
  private LocalDate startDate;
  private Time timePassed;
  private String comment;

  public Project(
      Integer id,
      String name,
      String description,
      LocalDate startDate,
      Time timePassed,
      String comment) {
    this.setId(id);
    this.setName(name);
    this.setDescription(description);
    this.setStartDate(startDate);
    this.setTimePassed(timePassed);
    this.setComment(comment);
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LocalDate getStartDate() {
    return this.startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public Time getTimePassed() {
    return this.timePassed;
  }

  public void setTimePassed(Time timePassed) {
    this.timePassed = timePassed;
  }

  public String getComment() {
    return this.comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }
}

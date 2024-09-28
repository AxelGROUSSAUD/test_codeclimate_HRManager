package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity;

import java.sql.Time;
import java.time.LocalDate;

/*
 * Classe qui définit les attributs d'une tâche
 */
public class Task {
  private Integer id;
  private Employee employee;
  private Project project;
  private Status status;
  private String name;
  private String description;
  private LocalDate startDate;
  private LocalDate endDate;
  private Time estimatedDuration;
  private Integer progress;
  private Time timePassed;
  private Boolean isAssign;
  private String comment;

  public Task(
      Integer id,
      Employee employee,
      Project project,
      Status status,
      String name,
      String description,
      LocalDate startDate,
      LocalDate endDate,
      Time estimatedDuration,
      Integer progress,
      Time timePassed,
      Boolean isAssign,
      String comment) {
    this.setId(id);
    this.setEmployee(employee);
    this.setProject(project);
    this.setStatus(status);
    this.setName(name);
    this.setDescription(description);
    this.setStartDate(startDate);
    this.setEndDate(endDate);
    this.setEstimatedDuration(estimatedDuration);
    this.setProgress(progress);
    this.setTimePassed(timePassed);
    this.setIsAssign(isAssign);
    this.setComment(comment);
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

  public Project getProject() {
    return this.project;
  }

  public void setProject(Project project) {
    this.project = project;
  }

  public Status getStatus() {
    return this.status;
  }

  public void setStatus(Status status) {
    this.status = status;
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

  public LocalDate getEndDate() {
    return this.endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public Time getEstimatedDuration() {
    return this.estimatedDuration;
  }

  public void setEstimatedDuration(Time estimatedDuration) {
    this.estimatedDuration = estimatedDuration;
  }

  public Integer getProgress() {
    return this.progress;
  }

  public void setProgress(Integer progress) {
    this.progress = progress;
  }

  public Time getTimePassed() {
    return this.timePassed;
  }

  public void setTimePassed(Time timePassed) {
    this.timePassed = timePassed;
  }

  public Boolean getIsAssign() {
    return this.isAssign;
  }

  public void setIsAssign(Boolean isAssign) {
    this.isAssign = isAssign;
  }

  public String getComment() {
    return this.comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }
}

package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity;

import java.sql.Time;

public class TaskHours {
  private Integer id;
  private Task task;
  private Hours hours;
  private Time timePassedToday;

  public TaskHours(Integer id, Task task, Hours hours, Time timePassedToday) {
    this.setId(id);
    this.setTask(task);
    this.setHours(hours);
    this.setTimePassedToday(timePassedToday);
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Task getTask() {
    return this.task;
  }

  public void setTask(Task task) {
    this.task = task;
  }

  public Hours getHours() {
    return this.hours;
  }

  public void setHours(Hours hours) {
    this.hours = hours;
  }

  public Time getTimePassedToday() {
    return this.timePassedToday;
  }

  public void setTimePassedToday(Time timePassedToday) {
    this.timePassedToday = timePassedToday;
  }
}

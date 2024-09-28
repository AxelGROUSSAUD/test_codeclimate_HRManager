package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity;

/*
 * Classe qui définit les attributs de la liaison entre les employées et les notifications
 */
public class EmployeeMessage {
  private Integer id;
  private Employee employee;
  private Message message;

  public EmployeeMessage(Integer id, Employee employee, Message message) {
    this.setId(id);
    this.setEmployee(employee);
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

  public Message getMessage() {
    return this.message;
  }

  public void setMessage(Message message) {
    this.message = message;
  }
}

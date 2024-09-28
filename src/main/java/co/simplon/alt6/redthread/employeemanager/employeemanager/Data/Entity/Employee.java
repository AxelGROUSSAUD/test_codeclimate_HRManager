package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity;

/*
 * Classe qui définit les attributs d'un employé.
 */
public class Employee {
  private Integer id;
  private Status status;
  private String name;
  private String firstName;
  private String mail;
  private String password;
  private String job;

  public Employee(
      Integer id,
      Status status,
      String name,
      String firstName,
      String mail,
      String password,
      String job) {
    this.setId(id);
    this.setStatus(status);
    this.setName(name);
    this.setFirstName(firstName);
    this.setMail(mail);
    this.setPassword(password);
    this.setJob(job);
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

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getMail() {
    return this.mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getJob() {
    return this.job;
  }

  public void setJob(String job) {
    this.job = job;
  }
}

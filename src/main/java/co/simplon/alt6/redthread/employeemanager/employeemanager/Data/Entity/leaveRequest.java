package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity;

import java.time.LocalDate;


/*
 * Classe qui définit les attributs d'une demande de congé.
 */
public class LeaveRequest {
    private Integer id;
    private LocalDate startDate;
    private LocalDate endDate;
    private String groundsRefusal;
    private Employee employee;
    private Status status;

    public LeaveRequest(Integer id, LocalDate startDate, LocalDate endDate, String groundsRefusal, Employee employee,
            Status status) {
        this.setId(id);
        this.setStartDate(startDate);
        this.setEndDate(endDate);
        this.setGroundsRefusal(groundsRefusal);
        this.setEmployee(employee);
        this.setStatus(status);
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getGroundsRefusal() {
        return this.groundsRefusal;
    }

    public void setGroundsRefusal(String groundsRefusal) {
        this.groundsRefusal = groundsRefusal;
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

    
    
}

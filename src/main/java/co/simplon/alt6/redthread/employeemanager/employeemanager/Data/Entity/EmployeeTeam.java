package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity;

/*
 * Classe qui définit les attributs de la liaison entre les employés et les équipes
 */
public class EmployeeTeam {
    private Integer id;
    private Employee employee;
    private Team team;

    public EmployeeTeam(Integer id, Employee employee, Team team) {
        this.setId(id);
        this.setEmployee(employee);
        this.setTeam(team);
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

    public Team getTeam() {
        return this.team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}

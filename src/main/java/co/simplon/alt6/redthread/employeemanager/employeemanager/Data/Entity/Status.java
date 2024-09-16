package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity;

/*
 * Classe qui définit les attributs d'un status
 */
public class Status {
    private Integer id;
    private String name;
    private String statusType;

    public Status(Integer id, String name, String statusType) {
        this.setId(id);
        this.setName(name);
        this.setStatusType(statusType);
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

    public String getStatusType() {
        return this.statusType;
    }
    
    public void setStatusType(String statusType) {
        this.statusType = statusType;
    }

    
}

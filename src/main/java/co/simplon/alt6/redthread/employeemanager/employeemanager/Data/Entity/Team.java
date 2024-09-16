package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity;



/*
 * Classe qui définit les attributs d'une équipe.
 */
public class Team {
    private Integer id;
    private String name;
    
    public Team(Integer id, String name) {
        this.setId(id);
        this.setName(name);
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
}

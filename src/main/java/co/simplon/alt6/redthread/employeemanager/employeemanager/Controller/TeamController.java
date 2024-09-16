package co.simplon.alt6.redthread.employeemanager.employeemanager.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.Team;

@RestController
public class TeamController {
    
    @GetMapping("/teams")
    public List<Team> getAll(){
        try{
            
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
        return null;

    }

    @GetMapping("/teams/{id}")
    public Team getById(@PathVariable int id){
        try{
            
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
        return null;

    }

    @GetMapping("/teams?filter={filterValue}")
    public List<Team> getWithFilter(@PathVariable String filterValue){
        try{
            
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
        return null;

    }

    @PutMapping("/teams/{id}")
    public void update(@PathVariable int id){
        try{
            
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }

    }

    @PostMapping("/teams/{team}")
    public void add(@PathVariable Team team){
        try{
            
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }

    }

    @DeleteMapping("/teams/{id}")
    public void delete(@PathVariable int id){
        try{
            
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }

    }
}

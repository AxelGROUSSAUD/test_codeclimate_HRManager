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

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.Hours;

@RestController
public class HoursController {
    
    @GetMapping("/hours")
    public List<Hours> getAll(){
        try{
            
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
        return null;

    }

    @GetMapping("/hours/{id}")
    public Hours getById(@PathVariable int id){
        try{
            
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
        return null;

    }

    @GetMapping("/hours?filter={filterValue}")
    public List<Hours> getWithFilter(@PathVariable String filterValue){
        try{
            
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
        return null;

    }

    @PutMapping("/hours/{id}")
    public void update(@PathVariable int id){
        try{
            
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }

    }

    @PostMapping("/hours/{hour}")
    public void add(@PathVariable Hours hour){
        try{
            
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }

    }

    @DeleteMapping("/hours/{id}")
    public void delete(@PathVariable int id){
        try{
            
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }

    }
}

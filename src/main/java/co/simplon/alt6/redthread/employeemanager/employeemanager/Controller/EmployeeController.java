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

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.Employee;

@RestController
public class EmployeeController{



    @GetMapping("/employees")
    public List<Employee> getAll(){
        try{
            
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
        return null;

    }

    @GetMapping("/employees/{id}")
    public Employee getById(@PathVariable int id){
        try{
            
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
        return null;

    }

    @GetMapping("/employees?filter={filterValue}")
    public List<Employee> getWithFilter(@PathVariable String filterValue){
        try{
            
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
        return null;

    }

    @PutMapping("/employees/{id}")
    public void update(@PathVariable int id){
        try{
            
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }

    }

    @PostMapping("/employees/{employee}")
    public void add(@PathVariable Employee employee){
        try{
            
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }

    }

    @DeleteMapping("/employees/{id}")
    public void delete(@PathVariable int id){
        try{
            
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }

    }

}
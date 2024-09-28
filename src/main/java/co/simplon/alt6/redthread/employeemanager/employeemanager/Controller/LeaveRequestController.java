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

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.LeaveRequest;

@RestController
public class LeaveRequestController {

    @GetMapping("/leave-requests")
    public List<LeaveRequest> getAll(){
        try{
            
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
        return null;

    }

    @GetMapping("/leave-requests/{id}")
    public LeaveRequest getById(@PathVariable int id){
        try{
            
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
        return null;

    }

    @GetMapping("/leave-requests?filter={filterValue}")
    public List<LeaveRequest> getWithFilter(@PathVariable String filterValue){
        try{
            
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
        return null;

    }

  @PutMapping("/leave-requests/{id}")
  public void update(@PathVariable int id) {
    try {

    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }
  }

    @PostMapping("/leave-requests/{leaveRequest}")
    public void add(@PathVariable LeaveRequest leaveRequest){
        try{
            
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }

    }

  @DeleteMapping("/leave-requests/{id}")
  public void delete(@PathVariable int id) {
    try {

    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }
  }
}

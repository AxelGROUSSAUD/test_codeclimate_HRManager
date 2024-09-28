package co.simplon.alt6.redthread.employeemanager.employeemanager.Controller;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.Task;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class TaskController {
  @GetMapping("/tasks")
  public List<Task> getAll() {
    try {

    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }
    return null;
  }

  @GetMapping("/tasks/{taskId}")
  public Task getById(@PathVariable int taskId) {
    try {

    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }
    return null;
  }

  @GetMapping("/tasks?filter={filterValue}")
  public List<Task> getWithFilter(@PathVariable String filterValue) {
    try {

    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }
    return null;
  }

  @PutMapping("/tasks/{taskId}")
  public void update(@PathVariable int taskId) {
    try {

    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }
  }

  @PostMapping("/tasks/{task}")
  public void add(@PathVariable Task task) {
    try {

    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }
  }

  @DeleteMapping("/tasks/{taskId}")
  public void delete(@PathVariable int taskId) {
    try {

    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }
  }
}

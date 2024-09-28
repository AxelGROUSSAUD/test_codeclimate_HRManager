package co.simplon.alt6.redthread.employeemanager.employeemanager.Controller;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.Task;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("projects/{projectId}")
public class ProjectTaskController {

  @GetMapping("/tasks")
  public List<Task> getAll(@PathVariable int projectId) {
    try {

    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }
    return null;
  }

  @GetMapping("/tasks/{taskId}")
  public Task getById(@PathVariable int projectId, @PathVariable int taskId) {
    try {

    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }
    return null;
  }

  @GetMapping("/tasks?filter={filterValue}")
  public List<Task> getWithFilter(@PathVariable int projectId, @PathVariable String filterValue) {
    try {

    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }
    return null;
  }

  @PutMapping("/tasks/{taskId}")
  public void update(@PathVariable int projectId, @PathVariable int taskId) {
    try {

    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }
  }

  @PostMapping("/tasks/{task}")
  public void add(@PathVariable int projectId, @PathVariable Task task) {
    try {

    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }
  }

  @DeleteMapping("/tasks/{taskId}")
  public void delete(@PathVariable int projectId, @PathVariable int taskId) {
    try {

    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }
  }
}

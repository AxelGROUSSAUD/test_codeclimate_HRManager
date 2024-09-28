package co.simplon.alt6.redthread.employeemanager.employeemanager.Controller;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.Project;
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
public class ProjectController {

  @GetMapping("/projects")
  public List<Project> getAll() {
    try {

    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }
    return null;
  }

  @GetMapping("/projects/{id}")
  public Project getById(@PathVariable int id) {
    try {

    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }
    return null;
  }

  @GetMapping("/projects?filter={filterValue}")
  public List<Project> getWithFilter(@PathVariable String filterValue) {
    try {

    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }
    return null;
  }

  @PutMapping("/projects/{id}")
  public void update(@PathVariable int id) {
    try {

    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }
  }

  @PostMapping("/projects/{project}")
  public void add(@PathVariable Project project) {
    try {

    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }
  }

  @DeleteMapping("/projects/{id}")
  public void delete(@PathVariable int id) {
    try {

    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }
  }
}

package co.simplon.alt6.redthread.employeemanager.employeemanager.Controller;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.Message;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class MessageController {
  @GetMapping("/messages")
  public List<Message> getAll() {
    try {

    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }
    return null;
  }

  @GetMapping("/messages/{id}")
  public Message getById(@PathVariable int id) {
    try {

    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }
    return null;
  }

  @GetMapping("/messages?filter={filterValue}")
  public List<Message> getWithFilter(@PathVariable String filterValue) {
    try {

    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }
    return null;
  }

  @PostMapping("/messages/{message}")
  public void add(@PathVariable Message message) {
    try {

    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }
  }

  @DeleteMapping("/messages/{id}")
  public void delete(@PathVariable int id) {
    try {

    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }
  }
}

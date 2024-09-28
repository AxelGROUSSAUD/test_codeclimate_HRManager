package co.simplon.alt6.redthread.employeemanager.employeemanager.Controller;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.Payslip;
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
public class PayslipController {

  @GetMapping("/payslips")
  public List<Payslip> getAll() {
    try {

    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }
    return null;
  }

  @GetMapping("/payslips/{id}")
  public Payslip getById(@PathVariable int id) {
    try {

    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }
    return null;
  }

  @GetMapping("/payslips?filter={filterValue}")
  public List<Payslip> getWithFilter(@PathVariable String filterValue) {
    try {

    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }
    return null;
  }

  @PutMapping("/payslips/{id}")
  public void update(@PathVariable int id) {
    try {

    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }
  }

  @PostMapping("/payslips/{payslip}")
  public void add(@PathVariable Payslip payslip) {
    try {

    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }
  }

  @DeleteMapping("/payslips/{id}")
  public void delete(@PathVariable int id) {
    try {

    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }
  }
}

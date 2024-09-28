package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository.interfaces;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.Message;
import java.util.List;

public interface MessageDaoI {
  boolean add(Message entity);

  List<Message> getAll();

  Message getById(int id);

  boolean update(Message entity);

  boolean delete(int id);
}

package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository.interfaces;

import java.util.List;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.Message;

public interface MessageDaoI {
    boolean add(Message entity);
    List<Message> getAll();
    Message getById(int id);
    boolean update(Message entity);
    boolean delete(int id);
}

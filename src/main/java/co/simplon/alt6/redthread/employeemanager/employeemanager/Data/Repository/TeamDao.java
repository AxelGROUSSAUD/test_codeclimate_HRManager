package co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository;

import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Entity.Team;
import co.simplon.alt6.redthread.employeemanager.employeemanager.Data.Repository.interfaces.TeamDaoI;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TeamDao extends AbstractDao<Team> implements TeamDaoI {

  public TeamDao() {
    super(
        "INSERT INTO team (name) VALUES (?)",
        "SELECT * FROM team",
        "SELECT * FROM team WHERE id = ?",
        "UPDATE team SET name = ? WHERE id = ?",
        "DELETE FROM team WHERE id = ?");
  }

  @Override
  protected void setEntityId(Team entity, int id) {
    entity.setId(id);
  }

  @Override
  protected void entityBindValues(PreparedStatement stmt, Team entity) throws SQLException {
    stmt.setString(1, entity.getName());
  }

  @Override
  protected void entityBindValuesWithId(PreparedStatement stmt, Team entity) throws SQLException {
    this.entityBindValues(stmt, entity);
    stmt.setInt(2, entity.getId());
  }

  @Override
  protected Team sqlToEntity(ResultSet rs) throws SQLException {
    return new Team(rs.getInt("id"), rs.getString("name"));
  }
}

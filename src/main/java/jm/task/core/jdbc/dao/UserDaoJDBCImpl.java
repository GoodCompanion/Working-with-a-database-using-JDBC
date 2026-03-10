package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {
    public UserDaoJDBCImpl() {
    }

    public void createUsersTable() {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS users(id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(100) NOT NULL, last_name VARCHAR(100) NOT NULL, age INT)";
        try (Statement statement = Util.getInstance().getConnection().createStatement()) {
            statement.execute(createTableSQL);
        } catch (SQLException e) {
            System.err.println("При создании таблицы произошла ошибка: " + e.getMessage());
        }
    }

    public void dropUsersTable() {
        String dropTableSQL = "DROP TABLE users";
        try (Statement statement = Util.getInstance().getConnection().createStatement()) {
            statement.execute(dropTableSQL);
        } catch (SQLException e) {
            System.err.println("При удалении таблицы произошла ошибка: " + e.getMessage());
        }
    }

    public void saveUser(String name, String lastName, byte age) {

    }

    public void removeUserById(long id) {

    }

    public List<User> getAllUsers() {
        return null;
    }

    public void cleanUsersTable() {

    }
}

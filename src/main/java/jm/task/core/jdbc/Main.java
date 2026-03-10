package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

public class Main {
    public static void main(String[] args) {
        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
        userDaoJDBC.createUsersTable();
        userDaoJDBC.saveUser("Vladimir", "Kalinin", (byte) 25);;
        userDaoJDBC.saveUser("Dmitriy", "Pavlenko", (byte) 20);
        userDaoJDBC.saveUser("Zaur", "Tregulov", (byte) 35);
        userDaoJDBC.saveUser("Maxim", "Mamedov", (byte) 14);
        userDaoJDBC.getAllUsers();
        userDaoJDBC.cleanUsersTable();
        userDaoJDBC.dropUsersTable();
    }
}

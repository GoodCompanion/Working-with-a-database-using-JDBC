package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Vladimir", "Kalinin", (byte) 25);
        userService.saveUser("Dmitriy", "Pavlenko", (byte) 20);
        userService.saveUser("Zaur", "Tregulov", (byte) 35);
        userService.saveUser("Maxim", "Mamedov", (byte) 14);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}

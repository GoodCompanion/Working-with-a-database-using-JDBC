package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
        System.out.println("Пытаемся создать таблицу");
        userDaoJDBC.createUsersTable();
        System.out.println("Таблица создана");
//        System.out.println("Пытаемся добавить пользователя");
//        userDaoJDBC.saveUser("vladimir", "Kalinin", (byte) 25);
//        System.out.println("Пользователь добавлен");
        System.out.println("Пытаемся удалить пользователя");
        userDaoJDBC.removeUserById(1);
        System.out.println("Пользователь удален");
    }
}

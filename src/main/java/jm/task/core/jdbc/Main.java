package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

public class Main {
    public static void main(String[] args) {
        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();

//        System.out.println("Пытаемся создать таблицу");
//        userDaoJDBC.createUsersTable();
//        System.out.println("Таблица создана");
        System.out.println("Пытаемся удалить таблицу");
        userDaoJDBC.dropUsersTable();
        System.out.println("Таблица удалена");
        System.out.println("Пытаемся создать таблицу");
        userDaoJDBC.createUsersTable();
        System.out.println("Таблица создана");
//        System.out.println("Пытаемся удалить таблицу");
//        userDaoJDBC.dropUsersTable();
//        System.out.println("Таблица удалена");
        System.out.println("Пытаемся добавить пользователя");
        userDaoJDBC.saveUser("Vladimir", "Kalinin", (byte) 25);
        System.out.println("Пользователь добавлен");

//        System.out.println("Пытаемся добавить пользователя");
//        userDaoJDBC.saveUser("Dmitriy", "Pavlenko", (byte) 20);
//        System.out.println("Пользователь добавлен");
//        System.out.println("Пытаемся добавить пользователя");
//        userDaoJDBC.saveUser("Zaur", "Tregulov", (byte) 35);
//        System.out.println("Пользователь добавлен");
//        System.out.println("Пытаемся получить всех пользователей");
//        for (User user : userDaoJDBC.getAllUsers()) {
//            System.out.println(user);
//        }
//        System.out.println("Все пользователи успешно получены");
//        System.out.println("Пытаемся удалить пользователя");
//        userDaoJDBC.removeUserById(1);
//        System.out.println("Пользователь удален");
        System.out.println("Пытаемся удалить всех пользователей");
        userDaoJDBC.cleanUsersTable();
        System.out.println("Все пользователи удалены");
        System.out.println("Пытаемся удалить всех пользователей");
        userDaoJDBC.cleanUsersTable();
        System.out.println("Все пользователи удалены");
        System.out.println(userDaoJDBC.getAllUsers().size());
    }
}

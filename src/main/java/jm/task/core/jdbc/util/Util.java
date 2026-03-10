package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/my_db?useSSL=false&serverTimezone=UTC";
    private static final String USER = "bestuser";
    private static final String PASSWORD = "bestuser";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    private static Util instance;
    private Connection connection;

    private Util() {
        try {
            Class.forName(DRIVER);
            this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Драйвер MySQL не найден", e);
        } catch (SQLException e) {
            throw new RuntimeException("Ошибка подключения к БД", e);
        }
    }

    public static Util getInstance() {
        if (instance == null) {
            instance = new Util();
        }
        return instance;
    }

    public Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Ошибка при получении connection", e);
        }
        return connection;
    }

    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                connection = null;
            } catch (SQLException e) {
                System.err.println("Ошибка при закрытии connection: " + e.getMessage());
            }
        }
    }

    // реализуйте настройку соеденения с БД
}

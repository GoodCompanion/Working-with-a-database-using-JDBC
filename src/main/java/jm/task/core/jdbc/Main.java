package jm.task.core.jdbc;

import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try (Connection connection = Util.getInstance().getConnection(); Statement statement = connection.createStatement()) {
            if (!connection.isClosed()) {
                System.out.println("Соединение с БД установлено!");
            }
            System.out.println("Соединение с БД закрыто!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

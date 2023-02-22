package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/pre-project_1.1.4";
    private static final String USERNAME = "DB_root";
    private static final String PASSWORD = "root";
    private static Connection connection;

    public static Connection connectToDB() {
        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
        } catch (SQLException e) {
            throw new RuntimeException("Driver is not registered ");
        }
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException("Bad connection");
        }
    }
    public static void closeConnection() {
        try {
            connection.close();
            System.out.println("Connection is closed");
        } catch (SQLException e) {
            throw new RuntimeException("Close connection failure");
        }
    }

}

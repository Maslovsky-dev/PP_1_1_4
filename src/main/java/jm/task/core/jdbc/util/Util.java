package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/pre-project_1.1.4";
    private static final String USERNAME = "DB_root";
    private static final String PASSWORD = "root";

    public static Connection connectToDB() {
        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
        } catch (SQLException e) {
            throw new RuntimeException("Driver is not registered ");
        }
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException("Bad connection");
        }
    }

}

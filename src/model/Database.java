package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final String jdbc_driver = "com.mysql.cj.jdbc.Driver";
    private static final String nama_db = "restaurant_db";
    private static final String URL = "jdbc:mysql://localhost:3306/restaurant_db";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    static Connection conn;

    public static Connection connect() throws SQLException {
        try {
            Class.forName(jdbc_driver);
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("MySQL Connected");
        } catch (ClassNotFoundException | SQLException exception) {
            System.out.println("Connection Failed: " + exception.getLocalizedMessage());
        }
        return conn;
    }
}

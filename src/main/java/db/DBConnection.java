package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private Connection connection;
    private static DBConnection instance;
    private DBConnection() throws SQLException {
        String URL = "jdbc:mysql://localhost:3306/hotel_reservation_system";
        String user = "root";
        String password = "1234";
        connection = DriverManager.getConnection(URL, user, password);
    }
    public Connection getConnection(){
        return connection;
    }
    public static DBConnection getInstance() throws SQLException {
        return instance == null ? instance = new DBConnection() : instance;
    }
}

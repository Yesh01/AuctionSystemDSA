package com.dsa.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/auction_db";
    private static final String USER = "yeshua";
    private static final String PASS = "Yeye@Venez#001";

    public Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connection to the database successful.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}


package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String jdbcString = "dm.jdbc.driver.DmDriver";
        String urlString = "jdbc:dm://localhost:5236?keyWords=(context)";
        String userName = "SYSDBA";
        String password = "SYSDBA";

        Class.forName(jdbcString);
        Connection connection = DriverManager.getConnection(urlString, userName, password);
        String sql = "SELECT 1 FROM DUAL";
        Statement stmt = connection.createStatement();
        ResultSet resultSet = stmt.executeQuery(sql);
        while (resultSet.next()) {
            System.out.println(resultSet.getString(1));
        }

        System.out.println("Hello world!");
    }
}
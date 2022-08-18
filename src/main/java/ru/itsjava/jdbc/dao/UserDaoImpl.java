package ru.itsjava.jdbc.dao;

import java.sql.*;

public class UserDaoImpl implements UserDao {

    public static final String DB_URL = "jdbc:MySql://localhost:3306/schema_itsjava?serverTimezone=UTC";
    public static final String DB_LOGIN = "***";
    public static final String DB_PASSWORD = "***";


    @Override
    public int getAgeByUserName(String name) {
        int age = -1;

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
             PreparedStatement preparedStatement = conn.prepareStatement("select age from schema_itsjava.users where name=?")
        ) {
            preparedStatement.setString(1, name);
            ResultSet res = preparedStatement.executeQuery();
            res.next();
            return res.getInt("age");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

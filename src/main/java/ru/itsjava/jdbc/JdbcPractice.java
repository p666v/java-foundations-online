package ru.itsjava.jdbc;

import ru.itsjava.jdbc.dao.UserDao;
import ru.itsjava.jdbc.dao.UserDaoImpl;

import java.sql.*;

public class JdbcPractice {
//    public static final String DB_URL = "jdbc:MySql://localhost:3306/schema_itsjava?serverTimezone=UTC";
//    public static final String DB_LOGIN = "****";
//    public static final String DB_PASSWORD = "****";

    public static void main(String[] args) {

//        try (Connection conn = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
//             Statement stmt = conn.createStatement()
//        ) {
//            ResultSet res = stmt.executeQuery("SELECT id, name, age FROM schema_itsjava.users");
//            while (res.next()) {
//                System.out.println(res.getInt("id") + " " + res.getString("name") + ":" + res.getInt("age"));
//            }
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }


        UserDao userDao = new UserDaoImpl();
        System.out.println("userDao.getAgeByUserName(\"Ваня\") = " + userDao.getAgeByUserName("Ваня"));


    }
}

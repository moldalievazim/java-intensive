package com.growthhungry.week8.homework;

import java.sql.*;

public class SQLiteExample {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            String URL = "jdbc:sqlite:/Users/arynaliev/sql/assignment.db";
            conn = DriverManager.getConnection(URL);
            stmt = conn.createStatement();

            String createTableSQL = "CREATE TABLE IF NOT EXISTS students (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "name TEXT," +
                    "age INTEGER," +
                    "grade REAL" +
                    ")";
            stmt.executeUpdate(createTableSQL);

            String insertSQL = "INSERT INTO students (name, age, grade) VALUES (?, ?, ?)";
            PreparedStatement insertStmt = conn.prepareStatement(insertSQL);

            insertStmt.setString(1, "Alice");
            insertStmt.setInt(2, 20);
            insertStmt.setDouble(3, 9.5);
            insertStmt.executeUpdate();
            insertStmt.setString(1, "Azim");
            insertStmt.setInt(2, 20);
            insertStmt.setDouble(3, 9.3);
            insertStmt.executeUpdate();


            String selectSQL = "SELECT * FROM students";
            rs = stmt.executeQuery(selectSQL);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                double grade = rs.getDouble("grade");
                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Grade: " + grade);
                System.out.println();
            }

            String updateSQL = "UPDATE students SET grade = 9.2 WHERE id = 1";
            stmt.executeUpdate(updateSQL);

            String deleteSQL = "DELETE FROM students WHERE id = 2";
            stmt.executeUpdate(deleteSQL);

            //Close resources
            rs.close();
            insertStmt.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

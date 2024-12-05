package com.growthhungry.week8.practical;

import java.sql.*;

public class Bookstore {
    private static final String URL = "jdbc:sqlite:/Users/arynaliev/Desktop/db/example.db";

    public static void main(String[] args) {
        Bookstore app = new Bookstore();
        app.addBook("The Pragmatic Programmer", "Daniel", 23.99);
        app.getAllBooks();
    }

    // Method to establish a connection
    private Connection connect() throws SQLException {
        return DriverManager.getConnection(URL);
    }

    public void addBook(String title, String author, double price) {
        String sql = "INSERT INTO books (title, author, price) VALUES (?, ?, ?";

        try (Connection connection = connect();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setString(1, title);
            preparedStatement.setString(2, author);
            preparedStatement.setDouble(3, price);

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0){
                System.out.println("A new book was inserted successfully!");
            }
        } catch (SQLException e){
            System.out.println("Error inserting book: " + e.getMessage());
        }
    }

    public void getAllBooks() {
        String sql = "SELECT * FROM books";

        try (Connection connection = connect();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)
        ) {
            System.out.println("Books available in the bookstore: ");
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id") +
                        ", Title: " + resultSet.getString("title") +
                        ", Author: " + resultSet.getString("author") +
                        ", Price: $" + resultSet.getDouble("price"));
            }
        } catch (SQLException e) {
            System.out.println("Error retrieving books: " + e.getMessage());
        }
    }
}

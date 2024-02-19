package lesson10_v2;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExpensesService {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/expensetracker";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "";

    public ExpensesService() {
    }

    public void insert(Expense data) {
        String INSERT_SQL = "insert into expenses (expense, date) values(?, ?);";
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SQL)) {

            preparedStatement.setString(1, data.getExpense());
            preparedStatement.setDate(2, data.getDate());

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            preparedStatement.execute();
            connection.close();
        } catch (SQLException e) {
            // print SQL exception information
            e.printStackTrace();
        }
    }

    public void getAll() {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            System.out.println("Connected to the database.");

            // Creating a statement
            try (Statement statement = connection.createStatement()) {
                // Executing a simple query
                String query = "SELECT * FROM expenses";
                try (ResultSet resultSet = statement.executeQuery(query)) {
                    // Processing the result set
                    while (resultSet.next()) {
                        int id = resultSet.getInt("id");
                        String expense = resultSet.getString("expense");
                        Date date = resultSet.getDate("date");
                        System.out.println("ID: " + id + ", Expense: " + expense + ", Date: " + date);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Expense[] get() {
        int size = 5;
        Expense[] expenses = new Expense[size];
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            System.out.println("Connected to the database.");

            // Creating a statement
            try (Statement statement = connection.createStatement()) {
                // Executing a simple query
                statement.setFetchSize(size);
                String query = "SELECT * FROM expenses";
                try (ResultSet resultSet = statement.executeQuery(query)) {
                    // Processing the result set
                    int i = 0;
                    while (resultSet.next()) {
                        int id = resultSet.getInt("id");
                        String exp = resultSet.getString("expense");
                        Date date = resultSet.getDate("date");
                        Expense expense = new Expense(id, exp, date);
                        expenses[i++] = expense;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return expenses;
    }

    public Expense get(int idx) {
        int size = 1;
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            System.out.println("Connected to the database.");

            // Creating a PreparedStatement
            String query = "SELECT * FROM expenses WHERE id = ?;";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                // Executing a simple query
                statement.setFetchSize(size);

                try (ResultSet resultSet = statement.executeQuery(query)) {
                    // Processing the result set
                    statement.setInt(1, idx);
                    int i = 0;
                    while (resultSet.next()) {
                        int id = resultSet.getInt("id");
                        String exp = resultSet.getString("expense");
                        Date date = resultSet.getDate("date");
                        Expense expense = new Expense(id, exp, date);
                        return expense;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

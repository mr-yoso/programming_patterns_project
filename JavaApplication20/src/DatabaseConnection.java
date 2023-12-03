
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Gayo
 */
public class DatabaseConnection {

    private static DatabaseConnection instance;

    public DatabaseConnection() {
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public static void initialize() {
        String createBooksTable = "CREATE TABLE IF NOT EXISTS Books("
                + "SN TEXT PRIMARY KEY,"
                + "Title TEXT NOT NULL,"
                + "Author TEXT NOT NULL,"
                + "Publisher TEXT NOT NULL,"
                + "Price DECIMAL(12, 2) NOT NULL,"
                + "Quantity INTEGER NOT NULL,"
                + "Issued INTEGER DEFAULT 0,"
                + "AddedDate DATE NOT NULL)";

        String createStudentsTable = "CREATE TABLE IF NOT EXISTS Students("
                + "StudentId INTEGER PRIMARY KEY,"
                + "Name TEXT NOT NULL,"
                + "Contact TEXT NOT NULL)";

        String createIssuedBooksTable = "CREATE TABLE IF NOT EXISTS IssuedBooks("
                + "id INTEGER PRIMARY KEY,"
                + "SN TEXT,"
                + "StId INTEGER,"
                + "StName TEXT,"
                + "StudentContact TEXT,"
                + "IssueDate DATE,"
                + "FOREIGN KEY(SN) REFERENCES Books(SN),"
                + "FOREIGN KEY(StId) REFERENCES Students(StudentId))";

        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:Library.db"); Statement statement = connection.createStatement()) {
            statement.executeUpdate(createBooksTable);
            statement.executeUpdate(createStudentsTable);
            statement.executeUpdate(createIssuedBooksTable);
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public static void loadBooksTable(LibraryModel library) {
        String sqlQuerySelectAllBooks = "SELECT * FROM Books";

        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:Library.db"); Statement statement = connection.createStatement()) {
            ResultSet rs = statement.executeQuery(sqlQuerySelectAllBooks);

            while (rs.next()) {
                String sn = rs.getString("SN");
                
                if (!library.getBook().get(0).getSn().equalsIgnoreCase(sn)) {
                    
                }
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

}

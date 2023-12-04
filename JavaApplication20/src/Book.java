
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Gayo
 */
public class Book {

    private String sn;
    private String title;
    private String author;
    private String publisher;
    private double price;
    private int quantity;
    private int issuedQuantity;
    private Date dateOfPurchase;
    Connection connection = null;

    public Book(String sn, String title, String author, String publisher, double price, int quantity, int issuedQuantity, Date dateOfPurchase) {
        this.sn = sn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.quantity = quantity;
        this.issuedQuantity = issuedQuantity;
        this.dateOfPurchase = dateOfPurchase;
    }

    public BookType createBook(String type) {
        if (type.equalsIgnoreCase("fiction")) {
            return new FictionBook();
        } else if (type.equalsIgnoreCase("nonfiction")) {
            return new NonFictionBook();
        }
        return null;
    }

    public void addBook(Book book) {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:Library.db");

            String query = ("INSERT INTO Books("
                    + "SN,"
                    + "Title,"
                    + "Author,"
                    + "Publisher,"
                    + "Price,"
                    + "Quantity,"
                    + "Issued,"
                    + "AddedDate) "
                    + "VALUES(?,?,?,?,?,?,?,?)");

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(book.getDateOfPurchase());

            preparedStatement.setString(1, book.getSn());
            preparedStatement.setString(2, book.getTitle());
            preparedStatement.setString(3, book.getAuthor());
            preparedStatement.setString(4, book.getPublisher());
            preparedStatement.setDouble(5, book.getPrice());
            preparedStatement.setInt(6, book.getQuantity());
            preparedStatement.setInt(7, book.getIssuedQuantity());
            preparedStatement.setString(8, date);
            
            preparedStatement.execute();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public boolean issueBook(Book book, Student student) {
        return false;
    }

    public boolean returnBook(Book book, Student student) {
        return false;
    }

    public static Map<String, String> viewCatalog() {
        return new TreeMap<>();
    }

    public static Map<String, String> viewIssuedBooks() {
        return new TreeMap<>();
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getIssuedQuantity() {
        return issuedQuantity;
    }

    public void setIssuedQuantity(int issuedQuantity) {
        this.issuedQuantity = issuedQuantity;
    }

    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

}


import java.util.*;

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

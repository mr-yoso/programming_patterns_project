
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Gayo
 */
public class Student {

    private String studentId;
    private String name;
    private String contactNumber;

    public Student(String studentId, String name, String contactNumber) {
        this.studentId = studentId;
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public List<Book> searchBookByTitle(String title) {
        return new ArrayList<>();
    }

    public List<Book> searchBookByName(String name) {
        return new ArrayList<>();
    }

    public List<Book> searchBookByPublisher(String year) {
        return new ArrayList<>();
    }

    public Map<String, String> viewCatalog() {
        return new TreeMap<>();
    }

    public boolean borrow(Book book) {
        return false;
    }

    public boolean toReturn(Book book) {
        return false;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

}

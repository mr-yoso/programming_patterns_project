/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gayo
 */
public class LibraryView {

    public void printLibraryDetails(Book book, Student student) {
        System.out.println("Library Details: ");
        System.out.println("Book Serial Number: " + book.getSn());
        System.out.println("Book Title" + book.getTitle());
        System.out.println("Book Author: " + book.getAuthor());
        System.out.println("Book Publisher: " + book.getPublisher());
        System.out.println("Book Quantity: " + book.getQuantity());
        System.out.println("Book Issued Quantity: " + book.getIssuedQuantity());
        System.out.println("Book Date of Purchase: " + book.getDateOfPurchase());
    }
}

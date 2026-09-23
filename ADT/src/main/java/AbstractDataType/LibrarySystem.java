/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractDataType;

/**
 *
 * @author waleeja
 */
public interface LibrarySystem {
    void addBook(int bookId, String title, String author);
    void removeBook(int bookId);
    String searchBook(int bookId);
    boolean issueBook(int bookId);
    boolean returnBook(int bookId);
}
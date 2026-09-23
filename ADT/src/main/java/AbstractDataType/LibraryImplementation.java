/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractDataType;

/**
 *
 * @author waleeja
 */
import java.util.HashMap;
import java.util.Map;

public class LibraryImplementation implements LibrarySystem {
    private Map<Integer, String[]> books = new HashMap<>(); // id -> [title, author, status]

    @Override
    public void addBook(int bookId, String title, String author) {
        books.put(bookId, new String[]{title, author, "available"});
    }

    @Override
    public void removeBook(int bookId) {
        books.remove(bookId);
    }

    @Override
    public String searchBook(int bookId) {
        if (!books.containsKey(bookId)) return "Not found";
        String[] b = books.get(bookId);
        return "Title: " + b[0] + ", Author: " + b[1] + ", Status: " + b[2];
    }

    @Override
    public boolean issueBook(int bookId) {
        if (books.containsKey(bookId) && books.get(bookId)[2].equals("available")) {
            books.get(bookId)[2] = "issued";
            return true;
        }
        return false;
    }

    @Override
    public boolean returnBook(int bookId) {
        if (books.containsKey(bookId) && books.get(bookId)[2].equals("issued")) {
            books.get(bookId)[2] = "available";
            return true;
        }
        return false;
    }
}
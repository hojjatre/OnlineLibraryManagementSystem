package org.example.catalogsystem;

import org.example.bookmanagement.Author;
import org.example.bookmanagement.Book;
import org.example.usermanagement.User;

import java.util.List;

public interface Catalog {
    Book findBookByName(String title);
    Book findBookByID(int id);
    void addBook(Book book);
    List<Book> findBooksByAuthor(String authorName);
    void addAuthor(Author author);
    void allBook(User user);
}

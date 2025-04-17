package com;

import java.util.ArrayList;
import java.util.List;

// SRP / LSP / ISP / DIP /OCP
public class LibraryService {
    private List<BookInterface> books = new ArrayList<>();


    public void addBook(BookInterface book) {
        books.add(book);
    }


    public BookInterface findBook(String title) {
        return books.stream()
                .filter(b -> b.getTitle().equalsIgnoreCase(title))
                .findFirst()
                .orElse(null);
    }


    public void borrowBook(String title, User user) {
        BookInterface book = findBook(title);
        if (book == null) {
            System.out.println(title + " not found.");
        } else if (!book.isAvailable()) {
            System.out.println(title + " is not available.");
        } else {
            book.borrowBook(user);
        }
    }


    public void returnBook(String title) {
        BookInterface book = findBook(title);
        if (book != null) {
            book.returnBook();
        } else {
            System.out.println(title + " not found.");
        }
    }
}

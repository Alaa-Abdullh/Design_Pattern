package com;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {
    private List<Book> books = new ArrayList<>();
    private BookFactory bookFactory;

    public LibraryService(BookFactory bookFactory) {
        this.bookFactory = bookFactory;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book createBook(String title) {
        return bookFactory.createBook(title);
    }

    // Rest of the methods...
}
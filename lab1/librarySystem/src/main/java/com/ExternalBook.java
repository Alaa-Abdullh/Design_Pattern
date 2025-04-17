package com;

// SRP  /OCP /LSP /DIP
public class ExternalBook {
    private String bookTitle;
    private String authorName;
    private int year;
    private boolean isBorrowable;

    public ExternalBook(String bookTitle, String authorName, int year, boolean isBorrowable) {
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.year = year;
        this.isBorrowable = isBorrowable;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getYear() {
        return year;
    }

    public boolean isBorrowable() {
        return isBorrowable;
    }
}
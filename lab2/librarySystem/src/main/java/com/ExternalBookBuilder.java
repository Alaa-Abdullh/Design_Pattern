package com;

public class ExternalBookBuilder {
    private String title;
    private String author;
    private int year;
    private boolean borrowable = true; // default

    public ExternalBookBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public ExternalBookBuilder withAuthor(String author) {
        this.author = author;
        return this;
    }

    public ExternalBookBuilder withYear(int year) {
        this.year = year;
        return this;
    }

    public ExternalBookBuilder withBorrowable(boolean borrowable) {
        this.borrowable = borrowable;
        return this;
    }

    public ExternalBook build() {
        return new ExternalBook(title, author, year, borrowable);
    }
}
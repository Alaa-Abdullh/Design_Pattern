package com;

public interface Borrow {
    void borrow(Book book, User user);
    void returnBook(Book book);
}
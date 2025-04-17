package com;

public class HistoricalBookTitle implements  Borrow{
    @Override
    public void borrow(User user, Book book) {
        System.out.println(user.getName() + " borrowed historical book: " + book.getTitle());
    }
}

package com;

public class PhysicalBorrowStrategy implements Borrow{
    @Override
    public void borrow(User user, Book book) {
        System.out.println(user.getName() + " borrowed physical book: " + book.getTitle());
    }
}

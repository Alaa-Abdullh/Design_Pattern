package com;

public class StandardBorrow implements BorrowBehavior {
    @Override
    public void borrow(Book book, User user) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.printf(user.getName() + " successfully borrowed " + book.getTitle());
        } else {
            System.out.println(book.getTitle() + " is not available.");
        }
    }

    @Override
    public void returnBook(Book book) {
        book.setAvailable(true);
        System.out.println("\n"+book.getTitle() + " has been returned.");
    }
}

public class PhysicalBorrow implements BorrowBehavior {
    @Override
    public void borrow(Book book, User user) {
        // Physical book specific borrowing logic
    }

    @Override
    public void returnBook(Book book) {
        // Physical book specific return logic
    }
}
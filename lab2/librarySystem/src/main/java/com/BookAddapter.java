package com;

public class ExternalBookAdapter extends Book {
    private ExternalBook externalBook;

    public ExternalBookAdapter(ExternalBook externalBook) {
        super(externalBook.getBookTitle());
        this.externalBook = externalBook;
    }

    @Override
    public boolean isAvailable() {
        return externalBook.isBorrow();
    }

    @Override
    public void borrowBook(User user) {
        if (isAvailable()) {
            externalBook.setBorrow(false);
            System.out.printf(user.getName() + " successfully borrowed " + getTitle());
        } else {
            System.out.println(getTitle() + " is not available.");
        }
    }

    @Override
    public void returnBook() {
        externalBook.setBorrow(true);
        System.out.println("\n"+getTitle() + " has been returned.");
    }
}
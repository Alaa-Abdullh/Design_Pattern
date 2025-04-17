package com;

public abstract class ExternalBookDecorator extends ExternalBook {
    protected ExternalBook decoratedBook;

    public ExternalBookDecorator(ExternalBook decoratedBook) {
        super(decoratedBook.getBookTitle(), decoratedBook.getAuthorName(),
                decoratedBook.getYear(), decoratedBook.isBorrow());
        this.decoratedBook = decoratedBook;
    }

    // Delegated methods
    @Override
    public String getBookTitle() {
        return decoratedBook.getBookTitle();
    }

    @Override
    public String getAuthorName() {
        return decoratedBook.getAuthorName();
    }

    @Override
    public int getYear() {
        return decoratedBook.getYear();
    }

    @Override
    public boolean isBorrow() {
        return decoratedBook.isBorrow();
    }

    @Override
    public void setBookTitle(String bookTitle) {
        decoratedBook.setBookTitle(bookTitle);
    }

    @Override
    public void setAuthorName(String authorName) {
        decoratedBook.setAuthorName(authorName);
    }

    @Override
    public void setYear(int year) {
        decoratedBook.setYear(year);
    }

    @Override
    public void setBorrowable(boolean Borrow) {
        decoratedBook.setBorrow(Borrow);
    }
}
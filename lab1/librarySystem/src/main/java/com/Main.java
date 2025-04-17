package com;

public class Main {
    public static void main(String[] args) {
        LibraryService library = new LibraryService();

        Book ebook = new EBook("Digital Fortress");
        ebook.setBorrowStrategy(new PhysicalBorrowStrategy());

        Book physicalBook = new PhysicalBook("The Hobbit");
        physicalBook.setBorrowStrategy(new PhysicalBorrowStrategy());

        Book historicalBook = new HistoricalBook("Sapiens");
        historicalBook.setBorrowStrategy(new HistoricalBookTitle());

        library.addBook(ebook);
        library.addBook(physicalBook);
        library.addBook(historicalBook);

        User user1 = new User("Ali", false);
        User user2 = new User("Sara", true);

        library.borrowBook("The Hobbit", user1);
        library.returnBook("The Hobbit");
        library.borrowBook("Sapiens", user2);
    }
}

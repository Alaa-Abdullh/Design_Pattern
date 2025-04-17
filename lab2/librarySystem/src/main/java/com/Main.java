package com;
public static void main(String[] args) {
    
    // Create library service with default factory
    LibraryService library = new LibraryService(physicalFactory);

    // Create books with appropriate behaviors
    Book regularBook = new Book("Harry Potter", new StandardBorrow());
    Book physicalBook = physicalFactory.createBook("Lord of the Rings");
    Book ebook = ebookFactory.createBook("Clean Code");

    // Create and decorate an external book
    ExternalBook externalBook = new ExternalBook("Design Patterns", "Erich Gamma", 1994, true);
    ExternalBook premiumExternalBook = new PremiumBookDecorator(externalBook, 9.99, 21);
    Book adaptedExternalBook = new ExternalBookAdapter(premiumExternalBook, new StandardBorrow());

    // Create users
    User john = new User("John", false);
    User alice = new User("Alice", true);

    // Add books to library
    library.addBook(regularBook);
    library.addBook(physicalBook);
    library.addBook(ebook);
    library.addBook(adaptedExternalBook);

    // Demonstrate borrowing
    System.out.println("===== Regular User =====");
    library.borrowBook("Harry Potter", john);
    library.borrowBook("Lord of the Rings", john);

    System.out.println("\n===== Premium User =====");
    library.borrowBook("Design Patterns", alice);
    library.returnBook("Design Patterns");

    // Show premium features
    if (adaptedExternalBook instanceof ExternalBookAdapter) {
        ExternalBookAdapter adapter = (ExternalBookAdapter) adaptedExternalBook;
        if (adapter.getExternalBook() instanceof PremiumBookDecorator) {
            PremiumBookDecorator premium = (PremiumBookDecorator) adapter.getExternalBook();
            System.out.println("\nPremium Features:");
            System.out.println(premium.formatPremiumDetails());
        }
    }
}
public class Main {
    public static void main(String[] args) {
        BookFactory physicalFactory = new PhysicalBookFactory();
        LibraryService library = new LibraryService(physicalFactory);

        Book book = new Book("Harry Potter", new StandardBorrow());
        Book physicalBook = physicalFactory.createBook("Lord of the Rings");

        // Create users
        User john = new User("John", false);
        User alice = new User("Alice", true);

        library.addBook(book);
        library.addBook(physicalBook);

    }
}

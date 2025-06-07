import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    // Constructor
    public Library() {
        books = new ArrayList<Book>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Generate a report of all books
    public void generateReport() {
        if (books.size() == 0) {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("\nLibrary Report:");
        for (Book book : books) {
            System.out.println("-------------------------------");
            System.out.println(book.toString());
            if (book.validateISBN()) {
                System.out.println("ISBN is valid.");
            } else {
                System.out.println("ISBN is INVALID.");
            }
        }
        System.out.println("-------------------------------");
    }
}
import java.util.Scanner;

public class LibraryDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Library library = new Library();
        String choice;

        System.out.println("Welcome to the Library System!");

        do {
            System.out.print("Enter book title: ");
            String title = input.nextLine();

            System.out.print("Enter book author: ");
            String author = input.nextLine();

            System.out.print("Enter ISBN: ");
            String isbn = input.nextLine();

            // Simple numeric validation
            if (!isbn.matches("[0-9Xx]+")) {
                System.out.println("Warning: ISBN should be numeric (may include X). Proceeding anyway.");
            }

            Book book = new Book(title, author, isbn);
            library.addBook(book);

            System.out.print("Add another book? (yes/no): ");
            choice = input.nextLine();

        } while (choice.equalsIgnoreCase("yes"));

        library.generateReport();
        input.close();
    }
}

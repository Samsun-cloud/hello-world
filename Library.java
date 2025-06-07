import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void generateReport() {
        System.out.println("===== Library Report =====");
        for (Book book : books) {
            System.out.println(book);
            System.out.println("---------------------------");
        }
    }
}

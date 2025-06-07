import java.util.*;

public class Book {
    // Fields
    private String title;
    private String author;
    private String ISBN;

    // Empty constructor
    public Book() {
        this.title = "";
        this.author = "";
        this.ISBN = "";
    }

    // Constructor with arguments
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    // ISBN Validation
    public boolean validateISBN() {
        String isbn = ISBN.replaceAll("-", "").trim();
        if (isbn.length() == 10) {
            return validateISBN10(isbn);
        } else if (isbn.length() == 13) {
            return validateISBN13(isbn);
        }
        return false;
    }

    // ISBN-10 Validation
    private boolean validateISBN10(String isbn) {
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            if (!Character.isDigit(isbn.charAt(i))) return false;
            sum += (10 - i) * Character.getNumericValue(isbn.charAt(i));
        }
        char lastChar = isbn.charAt(9);
        int checkDigit;
        if (lastChar == 'X' || lastChar == 'x') {
            checkDigit = 10;
        } else if (Character.isDigit(lastChar)) {
            checkDigit = Character.getNumericValue(lastChar);
        } else {
            return false;
        }
        return (sum + checkDigit) % 11 == 0;
    }

    // ISBN-13 Validation
    private boolean validateISBN13(String isbn) {
        int sum = 0;
        for (int i = 0; i < 12; i++) {
            if (!Character.isDigit(isbn.charAt(i))) return false;
            int digit = Character.getNumericValue(isbn.charAt(i));
            sum += (i % 2 == 0) ? digit : digit * 3;
        }
        if (!Character.isDigit(isbn.charAt(12))) return false;
        int checkDigit = Character.getNumericValue(isbn.charAt(12));
        return sum % 10 == (10 - checkDigit) % 10;
    }

    // String representation
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nISBN: " + ISBN;
    }
}
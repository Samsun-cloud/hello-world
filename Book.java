public class Book {
    private String title;
    private String author;
    private String isbn;

    // Empty constructor
    public Book() {}

    // Constructor with parameters
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getters and Setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    // Validate ISBN
    public boolean validateISBN() {
        if (isbn == null) return false;
        String cleanISBN = isbn.replaceAll("[^0-9X]", "");

        if (cleanISBN.length() == 10) {
            return validateISBN10(cleanISBN);
        } else if (cleanISBN.length() == 13) {
            return validateISBN13(cleanISBN);
        }
        return false;
    }

    private boolean validateISBN10(String isbn10) {
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            if (!Character.isDigit(isbn10.charAt(i))) return false;
            sum += (10 - i) * Character.getNumericValue(isbn10.charAt(i));
        }

        char lastChar = isbn10.charAt(9);
        int checkDigit = (lastChar == 'X' || lastChar == 'x') ? 10 : Character.getNumericValue(lastChar);

        return (sum + checkDigit) % 11 == 0;
    }

    private boolean validateISBN13(String isbn13) {
        int sum = 0;
        for (int i = 0; i < 12; i++) {
            if (!Character.isDigit(isbn13.charAt(i))) return false;
            int digit = Character.getNumericValue(isbn13.charAt(i));
            sum += (i % 2 == 0) ? digit : digit * 3;
        }

        int checkDigit = Character.getNumericValue(isbn13.charAt(12));
        int expected = (10 - (sum % 10)) % 10;

        return checkDigit == expected;
    }

    @Override
    public String toString() {
        return "Title: " + title +
               "\nAuthor: " + author +
               "\nISBN: " + isbn +
               "\nValid ISBN: " + (validateISBN() ? "Yes" : "No");
    }
}

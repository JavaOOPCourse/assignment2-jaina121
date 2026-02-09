public class Book {

    // TODO: make fields private
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;

    // TODO: Implement parameterized constructor
    // Параметризованный конструктор
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true;
    }

    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.year = other.year;
        this.isAvailable = other.isAvailable;
    }

    // TODO: Implement getters
    public String getTitle() {
        return null;
    }

    public String getAuthor() {
        return null;
    }

    public int getYear() {
        return 0;
    }

    public boolean isAvailable() {
        return false;
    }

    // Выдать книгу
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Книга успешно выдана.");
        } else {
            System.out.println("Книга уже выдана.");
        }
    }

    // Вернуть книгу
    public void returnBook() {
        isAvailable = true;
        System.out.println("Книга возвращена.");
    }

    @Override
    public String toString() {
        return "Title: " + title +
                ", Author: " + author +
                ", Year: " + year +
                ", Available: " + isAvailable;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;

        Book other = (Book) obj;
        return title.equals(other.title)
                && author.equals(other.author)
                && year == other.year;
    }
}
package readmultipledata;

import java.util.Arrays;

public class Book {
    private String title;
    private String isbn;
    private long year;
    private String[] author;
    Book()
    {

    }
    public Book(String title, String isbn, long year, String[] author) {
        this.title = title;
        this.isbn = isbn;
        this.year = year;
        this.author = author;
    }
    public String getTitle(String b1) {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }

    public String[] getAuthor() {
        return author;
    }

    public void setAuthor(String[] author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", year=" + year +
                ", author=" + Arrays.toString(author) +
                '}';
    }
}

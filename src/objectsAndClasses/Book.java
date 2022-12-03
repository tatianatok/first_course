package objectsAndClasses;

import java.util.Objects;

public class Book {
    private String titleBook;
    private Author author;
    private int date;

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return date == book.date && Objects.equals(titleBook, book.titleBook) && Objects.equals(author, book.author);
    }

    public int hashCode() {
        return Objects.hash(titleBook, author, date);
    }
    public Book(String titleBook, Author author, int date) {
        this.titleBook = titleBook;
        this.author = author;
        this.date = date;
    }

    public String toString() {
        return "Книга: " + this.titleBook + "; Автор: " + this.author + "; Дата публикации: " + this.date;
    }
    public int getDate() {
        return this.date;
    }
    public void setDate(int date) {
        this.date = date;
    }


}


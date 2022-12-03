package objectsAndClasses;

import java.io.PrintStream;

public class MainObjectsAndClasses {
    public MainObjectsAndClasses() {
    }

    public static void main(String[] args) {
        Author author1 = new Author("Александр", "Пушкин");
        Author author2 = new Author("Владислав", "Крапивин");

        Book book1 = new Book("Сказка о царе Салтане", author1, 1831);
        Book book2 = new Book("Дети синего фламинго", author2, 1981);

        book1.setDate(1831);


        System.out.println(book1);
        System.out.println(book2);
    }
}

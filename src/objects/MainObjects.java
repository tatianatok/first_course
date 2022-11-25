package objects;

public class MainObjects {

    public static void main(String[] args) {

        Author author1 = new Author("Александр", "Пушкин");
        Author author2 = new Author("Владислав", "Крапивин");

        Book book1 = new Book("Сказка о царе Салтане", author1, 1831);
        Book book2 = new Book("Дети синего фламинго",  author2, 1981);

        book1.setDate(2000);

        System.out.println("Книга 1 - " + book1.getTitleBook() + ", " + author1.getName() + " " + author1.getSurname() + ", " + book1.getDate());
        System.out.println("Книга 2 - " + book2.getTitleBook() + ", " + author2.getName() + " " + author2.getSurname() + ", " + book2.getDate());
    }
}

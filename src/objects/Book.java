package objects;

public class Book {
    private String titleBook;
    private Author author;
    private int date;

    public Book(String titleBook, Author author, int date) {
        this.titleBook = titleBook;
        this.author = author;
        this.date = date;
    }
        public String getTitleBook() {
            return this.titleBook;
    }
    public Author getAuthor() {
        return this.author;
    }
    public  int getDate(){
        return this.date;
    }
    public void setDate(int date){
    this.date = date;
    }
}

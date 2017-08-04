public class Book {

    private String title;
    private int yearPublished;
    private String author;

    public Book(String title, int yearPublished, String author) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;

    }

    @Override
    public String toString() {
        return title;
    }

}

public class Book {

    private String title;
    private String yearPublished;
    private String author;

    public Book(String title, String yearPublished, String author) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;

    }

    @Override
    public String toString() {
        return title + "\t\t" + yearPublished + "\t\t" + author;
    }

}

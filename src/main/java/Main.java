import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(System.out);

        biblioteca.printWelcomeCustomer();
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Book1", "0", "John Doe"));
        biblioteca.printListOfBooks(books);
    }
}

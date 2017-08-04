import java.util.ArrayList;

public class Biblioteca {

    static BibliotecaPrinter printer;
    static ArrayList<Book> books;

    public static void main(String[] args) {
        printer = new BibliotecaPrinter(System.out);
        printer.printWelcomeCustomer();

        books = new ArrayList<>();
        books.add(new Book("Book1"));
        printer.printListOfBooks(books);
    }
}

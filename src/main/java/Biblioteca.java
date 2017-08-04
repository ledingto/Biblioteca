import java.io.PrintStream;
import java.util.ArrayList;

public class Biblioteca {

    private PrintStream printStream;
    private ArrayList<Book> books;

    public Biblioteca(PrintStream printStream) {
        this.printStream = printStream;
        books = new ArrayList<>();
    }

    public void printWelcomeCustomer() {
        printStream.println("Welcome to the Biblioteca!");
    }

    public void printListOfBooks(ArrayList<Book> books) {
        for (Book eachBook : books) {
            printStream.println(eachBook.getTitle());
        }
    }
}

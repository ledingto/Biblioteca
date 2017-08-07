import java.io.PrintStream;
import java.util.ArrayList;

public class Biblioteca {

    private PrintStream printStream;
    private ArrayList<Book> books;
    private Menu menu;

    public Biblioteca(PrintStream printStream) {
        this.printStream = printStream;
        books = new ArrayList<>();
        menu = new Menu(printStream);
    }

    public void printWelcomeCustomer() {
        printStream.println("Welcome to the Biblioteca!");
    }

    public void printListOfBooks(ArrayList<Book> books) {
        for (Book eachBook : books) {
            printStream.println(eachBook.toString());
        }
    }

    public void listMenuOptions() {
        menu.printOptions();
    }
}

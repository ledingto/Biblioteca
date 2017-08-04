import java.io.PrintStream;
import java.util.ArrayList;

public class BibliotecaPrinter {


    private PrintStream printStream;

    public BibliotecaPrinter(PrintStream printStream) {
        this.printStream = printStream;
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

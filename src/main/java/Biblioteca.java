import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;

public class Biblioteca {

    private PrintStream printStream;
    private ArrayList<Book> books;
    private Menu menu;
    private BufferedReader reader;

    public Biblioteca(PrintStream printStream) {
        this.printStream = printStream;
        books = new ArrayList<>();
        menu = new Menu(printStream);
        reader = new BufferedReader(new InputStreamReader(System.in));
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

    public String getUserInput(BufferedReader reader) throws IOException {
        printStream.println("Please enter the option number:");
        String userInput = reader.readLine();
        return userInput;
    }

    public void selectOption(String userInput) {
        printListOfBooks(books);
    }

    public void addBook(Book bookToAdd) {
        books.add(bookToAdd);
    }

    public int booksSize() {
        return books.size();
    }
}

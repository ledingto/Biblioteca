import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;

public class Biblioteca {

    private PrintStream printStream;
    private ArrayList<Book> books;
    private Menu menu;
//    private BufferedReader reader;

    public Biblioteca(PrintStream printStream, BufferedReader reader) {
        this.printStream = printStream;
        books = new ArrayList<>();
        menu = new Menu(printStream, reader);
//        reader = new BufferedReader(new InputStreamReader(System.in));
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

    public void selectOption() {
        String userChoice = menu.getUserInput();
        if (userChoice.equals("1")) {
            printListOfBooks(books);
        }
        else {
            printStream.println("Invalid Option.");
        }

    }

    public void addBook(Book bookToAdd) {
        books.add(bookToAdd);
    }

    public int getNumberOfBooks() {
        return books.size();
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        Biblioteca biblioteca = new Biblioteca(System.out);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        biblioteca.printWelcomeCustomer();
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Book1", "0", "John Doe"));

        biblioteca.listMenuOptions();
        biblioteca.getUserInput(reader);
    }
}

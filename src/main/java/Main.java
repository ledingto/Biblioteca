import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Biblioteca biblioteca = new Biblioteca(System.out, reader);

        biblioteca.printWelcomeCustomer();
        biblioteca.addBook(new Book("Book1", "0", "John Doe"));

        biblioteca.listMenuOptions();
        biblioteca.selectOption();

    }
}

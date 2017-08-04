import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class BibliotecaTest {
    @Test
    // Welcome Message  - As a customer, I would like to see a welcome message when I start the application,
    // so that I feel welcome and know that Biblioteca is available.
    public void shouldSeeWelcomeMessageWhenApplicationStarted() throws Exception {
        PrintStream printStream = mock(PrintStream.class);
        Biblioteca biblioteca = new Biblioteca(printStream);
        biblioteca.printWelcomeCustomer();
        verify(printStream).println("Welcome to the Biblioteca!");
    }

    //List Books - As a customer, after the welcome message appears I would like to see a list of all library books,
    // so that I can browse for books I might want to check-out. Assume that there is a pre-existing list of books.
    // You don't need to support adding or removing books from the library.
    @Test
    public void shouldSeeListOfBookTitles() throws Exception {
        PrintStream printStream = mock(PrintStream.class);
        Biblioteca biblioteca = new Biblioteca(printStream);

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Book1", 0, "John Doe"));
        books.add(new Book("Book2",0, "John Doe"));

        biblioteca.printListOfBooks(books);
        verify(printStream, times(1)).println("Book1");
        verify(printStream, times(1)).println("Book2");
    }

    @Test
    public void shouldListAllInfoForABook() throws Exception {
        Book book = new Book ("Book", 0,"Author");
        book.toString();

        //verify with mock printstream
    }
}

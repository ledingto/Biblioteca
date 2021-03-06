import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class BibliotecaTest {

    PrintStream printStream;
    BufferedReader reader;
    Biblioteca biblioteca;
    ArrayList<Book> books;


    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        reader = mock(BufferedReader.class);
        biblioteca = new Biblioteca(printStream, reader);
        books = new ArrayList<>();
    }

    @Test
    // Welcome Message  - As a customer, I would like to see a welcome message when I start the application,
    // so that I feel welcome and know that Biblioteca is available.
    public void shouldSeeWelcomeMessageWhenApplicationStarted() throws Exception {

        biblioteca.printWelcomeCustomer();
        verify(printStream).println("Welcome to the Biblioteca!");
    }

    //List Books - As a customer, after the welcome message appears I would like to see a list of all library books,
    // so that I can browse for books I might want to check-out. Assume that there is a pre-existing list of books.
    // You don't need to support adding or removing books from the library.
    @Test
    public void shouldSeeListOfBookTitles() throws Exception {
        books.add(new Book("Book1", "0", "John Doe"));
        books.add(new Book("Book2","0", "John Doe"));

        biblioteca.printListOfBooks(books);
        verify(printStream, times(1)).println("Book1\t\t0\t\tJohn Doe");
        verify(printStream, times(1)).println("Book2\t\t0\t\tJohn Doe");
    }

    @Test
    public void shouldListAllInfoForABook() throws Exception {
        Book book = new Book ("Book", "0","Author");
        assertEquals(book.toString(), "Book\t\t0\t\tAuthor");
    }

    @Test
    public void shouldListAllInfoForMultipleBooks() throws Exception {

        books.add(new Book("Book1", "1", "Author1"));
        books.add(new Book("Book2", "7", "Author2"));
        books.add(new Book("Book3", "9", "Author3"));

        biblioteca.printListOfBooks(books);

        verify(printStream, times(1)).println("Book1\t\t1\t\tAuthor1");
        verify(printStream, times(1)).println("Book2\t\t7\t\tAuthor2");
        verify(printStream, times(1)).println("Book3\t\t9\t\tAuthor3");
    }

    @Test
    public void shouldAddBookWhenAddBookisCalled() {
        Book bookToAdd = new Book("Harry Potter", "2000", "JK Rowling");
        int originalSize = biblioteca.getNumberOfBooks();
        biblioteca.addBook(bookToAdd);
        assertEquals(1, biblioteca.getNumberOfBooks()-originalSize);

    }

    @Test
    public void shouldDisplayInvalidOptionMessage() throws Exception {
        when(reader.readLine()).thenReturn("wrong!");

        biblioteca.selectOption();

        verify(printStream).println("Invalid Option.");
    }

    @Test
    public void whenUserChoosesListBooksOptionShouldPrintListOfBooks() throws IOException {
        when(reader.readLine()).thenReturn("1");

        biblioteca.addBook(new Book("Book1", "1", "Author1"));
        biblioteca.addBook(new Book("Book2", "7", "Author2"));
        biblioteca.addBook(new Book("Book3", "9", "Author3"));

        biblioteca.selectOption();

        verify(printStream).println("Book1\t\t1\t\tAuthor1");
        verify(printStream).println("Book2\t\t7\t\tAuthor2");
        verify(printStream).println("Book3\t\t9\t\tAuthor3");
    }
}
